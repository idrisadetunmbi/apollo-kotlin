package com.apollographql.apollo3.compiler.operationoutput

import com.apollographql.apollo3.compiler.MOSHI
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Types
import okio.BufferedSource

/**
 * [OperationOutput] is a map where the operationId is the key and [OperationDescriptor] the value
 *
 * By default the operationId is a sha256 but it can be changed for custom whitelisting implementations
 */
typealias OperationOutput = Map<String, OperationDescriptor>

/**
 * This structure is also generated by other tools (iOS, cli, ...), try to keep the field names if possible.
 */
@JsonClass(generateAdapter = true)
class OperationDescriptor(
    val name: String,
    val source: String
)

fun OperationOutput.findOperationId(name: String): String {
  val id = entries.find { it.value.name == name }?.key
  check(id != null) {
    "cannot find operation ID for '$name', check your operationOutput.json"
  }
  return id
}

fun BufferedSource.toOperationOutput(): OperationOutput {
  return operationOutputAdapter().fromJson(this)!!
}

private fun operationOutputAdapter(): JsonAdapter<OperationOutput> {
  val type = Types.newParameterizedType(Map::class.java, String::class.java, OperationDescriptor::class.java)
  return MOSHI.adapter<OperationOutput>(type)
}
