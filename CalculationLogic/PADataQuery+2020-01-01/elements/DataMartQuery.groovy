def dmCtx = api.getDatamartContext()
def salesDM = dmCtx.getDatamart("Transaction")

def customer = out.Customer
def datamartQuery = dmCtx.newQuery(salesDM, false)

datamartQuery.select("CustomerId")
datamartQuery.select("Cost")
datamartQuery.select("InvoiceDate")

datamartQuery.where(
        Filter.equal("CustomerID", customer)
)

def result = dmCtx.executeQuery(datamartQuery)

result?.getData()?.forEach { row ->
    api.trace("Customer ID:", row.CustomerId)
    api.trace("Date:", row.InvoiceDate)
    api.trace("Cost", row.Cost)
}