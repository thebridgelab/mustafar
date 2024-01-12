if (api.isInputGenerationExecution()) {       // (1)
    return api.inputBuilderFactory()
            .createUserEntry("Customer")      // (2)
            .setLabel("Customer")
            .getInput()
}
return input.Customer                         // (3)