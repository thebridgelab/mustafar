if (api.isInputGenerationExecution())  {
//If running in intelliJ give customer input selection
    if (api.isDebugMode()) {
        api.inputBuilderFactory()
                .createCustomerEntry("Customer")
                .setLabel("Customer")
                .getInput()
    }
}
// if not in inputgeneratrionExecution set return to Customer input value
else  return input.Customer