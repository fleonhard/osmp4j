package com.osmp4j.data.osm.features

object OSMService : OSMFeature<OSMService>("service") {
    val CROSSOVER = value("crossover")
    val SIDING = value("siding")
    val SPUR = value("spur")
    val YARD = value("yard")
}
