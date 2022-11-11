package br.com.gomobi

class PlaceSelectionListener {


    // Initialize the AutocompleteSupportFragment.
    val autocompleteFragment =
        supportFragmentManager.findFragmentById(R.id.autocomplete_fragment)
                as AutocompleteSupportFragment

    // Specify the types of place data to return.
    autocompleteFragment.setPlaceFields(listOf(Place.Field.ID, Place.Field.NAME))

    // Set up a PlaceSelectionListener to handle the response.
    autocompleteFragment.setOnPlaceSelectedListener(object : PlaceSelectionListener {
        override fun onPlaceSelected(place: Place) {
            // TODO: Get info about the selected place.
            Log.i(TAG, "Place: ${place.name}, ${place.id}")
        }

        override fun onError(status: Status) {
            // TODO: Handle the error.
            Log.i(TAG, "An error occurred: $status")
        }
    })


}