if (out.Competition?.price != null && out.CompetitivePositioning != null) {
    return out.Competition.price * out.CompetitivePositioning
} else {
    api.addWarning("Cannot calculate The ListPrice because CompPrice is not available.")
    return null
}