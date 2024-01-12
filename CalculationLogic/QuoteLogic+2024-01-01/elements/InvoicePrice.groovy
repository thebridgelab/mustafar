if (out.ListPrice == null ||
        out.SaleDiscountAbs == null) {
    api.addWarning("InvoicePrice cannot be calculated: missing parameter(s)")
    return null
}

return invoicePrice = out.ListPrice - out.SaleDiscountAbs
