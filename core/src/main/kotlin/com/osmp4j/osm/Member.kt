package com.osmp4j.osm

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.osmp4j.noarg.NoArg

@NoArg
class Member(

        @JacksonXmlProperty(isAttribute = true)
        val type: String,

        @JacksonXmlProperty(isAttribute = true)
        override val ref: Long,

        @JacksonXmlProperty(isAttribute = true)
        val role: String
) : Ref