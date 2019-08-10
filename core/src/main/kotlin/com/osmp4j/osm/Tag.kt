package com.osmp4j.osm

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.osmp4j.noarg.NoArg
import com.osmp4j.osm.features.Feature
import com.osmp4j.osm.features.Value

@NoArg
data class Tag(
        @JacksonXmlProperty(isAttribute = true)
        val k: String,

        @JacksonXmlProperty(isAttribute = true)
        val v: String
)

fun <X> Sequence<Tag>.contains(feature: Feature<X>) = any { it.k == feature.key }
fun <X> Sequence<Tag>.contains(feature: Feature<X>, value: Value<X>) = any { it.k == feature.key && it.v == value.name }
fun <X> Sequence<Tag>.contains(value: Value<X>) = any { it.v == value.name }

fun <X> Sequence<Tag>.filter(feature: Feature<X>) = filter { it.k == feature.key }
fun <X> Sequence<Tag>.filter(feature: Feature<X>, value: Value<X>) = filter { it.k == feature.key && it.v == value.name }
fun <X> Sequence<Tag>.filter(value: Value<X>) = filter { it.v == value.name }










