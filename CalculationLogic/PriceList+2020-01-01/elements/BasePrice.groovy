def avgCost = api.productExtension("ProductCost")?.getAt(0)?.attribute1

if(avgCost == null) {
    api.addWarning("Could not find Average Cost in PX table ProductCost")
    return null
}

return avgCost