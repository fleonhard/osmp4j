package com.osmp4j.osm.features

object PublicTransport : Feature<PublicTransport>("public_transport") {
    val STOP_POSITION = value("stop_position")
    val PLATFORM = value("platform")
    val STATION = value("station")
    val STOP_AREA = value("stop_area")
}
