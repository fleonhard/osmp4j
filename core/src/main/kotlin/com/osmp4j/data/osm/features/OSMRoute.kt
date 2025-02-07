package com.osmp4j.data.osm.features

object OSMRoute : OSMFeature<OSMRoute>("route") {
    val BICYCLE = value("bicycle")
    val BUS = value("bus")
    val CANOE = value("canoe")
    val EVACUATION = value("evacuation")
    val DETOUR = value("detour")
    val FERRY = value("ferry")
    val FITNESS_TRAIL = value("fitness_trail")
    val HIKING = value("hiking")
    val HORSE = value("horse")
    val INLINE_SKATES = value("inline_skates")
    val LIGHT_RAIL = value("light_rail")
    val MOTORBOAT = value("motorboat")
    val MTB = value("mtb")
    val NORDIC_WALKING = value("nordic_walking")
    val PIPELINE = value("pipeline")
    val PISTE = value("piste")
    val POWER = value("power")
    val RAILWAY = value("railway")
    val ROAD = value("road")
    val RUNNING = value("running")
    val SKI = value("ski")
    val TRAIN = value("train")
    val TRAM = value("tram")
    val USER_DEFINED = value("User defined")
}
