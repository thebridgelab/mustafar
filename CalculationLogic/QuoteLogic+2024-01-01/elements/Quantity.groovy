if (api.isInputGenerationExecution()) {
    return api.inputBuilderFactory()
            .createIntegerUserEntry("Quantity")
            .setLabel("Quantity")
            .setRequired(true)     //sets default value to 1
            .setValue(1)           //sets default value to 1
            .setFrom(0)            //sets minimum value to 0
            .getInput()
}
else{
    return input.Quantity
}