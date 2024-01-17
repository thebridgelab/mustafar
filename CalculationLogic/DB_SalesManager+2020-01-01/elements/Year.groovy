if (api.isInputGenerationExecution()) {
    return api.inputBuilderFactory()
            .createDmFilter("Year", "DM.Transaction", "InvoiceDateYear")
            .getInput()
}

return input.Year