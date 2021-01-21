// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.test_inline.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.test_inline.GetPage
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object GetPage_ResponseAdapter : ResponseAdapter<GetPage.Data> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forObject("collection", "collection", null, false, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): GetPage.Data {
    return reader.run {
      var collection: GetPage.Data.Collection? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> collection = readObject<GetPage.Data.Collection>(RESPONSE_FIELDS[0]) { reader ->
            Collection.fromResponse(reader)
          }
          else -> break
        }
      }
      GetPage.Data(
        collection = collection!!
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: GetPage.Data) {
    writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
      Collection.toResponse(writer, value.collection)
    }
  }

  object Collection : ResponseAdapter<GetPage.Data.Collection> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forList("items", "items", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        GetPage.Data.Collection {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "ParticularCollection" -> ParticularCollectionCollection.fromResponse(reader, typename)
        else -> OtherCollection.fromResponse(reader, typename)
      }
    }

    override fun toResponse(writer: ResponseWriter, value: GetPage.Data.Collection) {
      when(value) {
        is GetPage.Data.Collection.ParticularCollectionCollection -> ParticularCollectionCollection.toResponse(writer, value)
        is GetPage.Data.Collection.OtherCollection -> OtherCollection.toResponse(writer, value)
      }
    }

    object ParticularCollectionCollection :
        ResponseAdapter<GetPage.Data.Collection.ParticularCollectionCollection> {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forList("items", "items", null, false, null)
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          GetPage.Data.Collection.ParticularCollectionCollection {
        return reader.run {
          var __typename: String? = __typename
          var items: List<GetPage.Data.Collection.ParticularCollectionCollection.Item>? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              1 -> items = readList<GetPage.Data.Collection.ParticularCollectionCollection.Item>(RESPONSE_FIELDS[1]) { reader ->
                reader.readObject<GetPage.Data.Collection.ParticularCollectionCollection.Item> { reader ->
                  Item.fromResponse(reader)
                }
              }?.map { it!! }
              else -> break
            }
          }
          GetPage.Data.Collection.ParticularCollectionCollection(
            __typename = __typename!!,
            items = items!!
          )
        }
      }

      override fun toResponse(writer: ResponseWriter,
          value: GetPage.Data.Collection.ParticularCollectionCollection) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
        writer.writeList(RESPONSE_FIELDS[1], value.items) { value, listItemWriter ->
          listItemWriter.writeObject { writer ->
            Item.toResponse(writer, value)
          }
        }
      }

      object Item : ResponseAdapter<GetPage.Data.Collection.ParticularCollectionCollection.Item> {
        private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null)
        )

        override fun fromResponse(reader: ResponseReader, __typename: String?):
            GetPage.Data.Collection.ParticularCollectionCollection.Item {
          val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
          return when(typename) {
            "ParticularItem" -> ParticularItemItem.fromResponse(reader, typename)
            else -> OtherItem.fromResponse(reader, typename)
          }
        }

        override fun toResponse(writer: ResponseWriter,
            value: GetPage.Data.Collection.ParticularCollectionCollection.Item) {
          when(value) {
            is GetPage.Data.Collection.ParticularCollectionCollection.Item.ParticularItemItem -> ParticularItemItem.toResponse(writer, value)
            is GetPage.Data.Collection.ParticularCollectionCollection.Item.OtherItem -> OtherItem.toResponse(writer, value)
          }
        }

        object ParticularItemItem :
            ResponseAdapter<GetPage.Data.Collection.ParticularCollectionCollection.Item.ParticularItemItem>
            {
          private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
            ResponseField.forString("title", "title", null, false, null),
            ResponseField.forString("__typename", "__typename", null, false, null),
            ResponseField.forString("image", "image", null, false, null)
          )

          override fun fromResponse(reader: ResponseReader, __typename: String?):
              GetPage.Data.Collection.ParticularCollectionCollection.Item.ParticularItemItem {
            return reader.run {
              var title: String? = null
              var __typename: String? = __typename
              var image: String? = null
              while(true) {
                when (selectField(RESPONSE_FIELDS)) {
                  0 -> title = readString(RESPONSE_FIELDS[0])
                  1 -> __typename = readString(RESPONSE_FIELDS[1])
                  2 -> image = readString(RESPONSE_FIELDS[2])
                  else -> break
                }
              }
              GetPage.Data.Collection.ParticularCollectionCollection.Item.ParticularItemItem(
                title = title!!,
                __typename = __typename!!,
                image = image!!
              )
            }
          }

          override fun toResponse(writer: ResponseWriter,
              value: GetPage.Data.Collection.ParticularCollectionCollection.Item.ParticularItemItem) {
            writer.writeString(RESPONSE_FIELDS[0], value.title)
            writer.writeString(RESPONSE_FIELDS[1], value.__typename)
            writer.writeString(RESPONSE_FIELDS[2], value.image)
          }
        }

        object OtherItem :
            ResponseAdapter<GetPage.Data.Collection.ParticularCollectionCollection.Item.OtherItem> {
          private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
            ResponseField.forString("title", "title", null, false, null),
            ResponseField.forString("__typename", "__typename", null, false, null)
          )

          override fun fromResponse(reader: ResponseReader, __typename: String?):
              GetPage.Data.Collection.ParticularCollectionCollection.Item.OtherItem {
            return reader.run {
              var title: String? = null
              var __typename: String? = __typename
              while(true) {
                when (selectField(RESPONSE_FIELDS)) {
                  0 -> title = readString(RESPONSE_FIELDS[0])
                  1 -> __typename = readString(RESPONSE_FIELDS[1])
                  else -> break
                }
              }
              GetPage.Data.Collection.ParticularCollectionCollection.Item.OtherItem(
                title = title!!,
                __typename = __typename!!
              )
            }
          }

          override fun toResponse(writer: ResponseWriter,
              value: GetPage.Data.Collection.ParticularCollectionCollection.Item.OtherItem) {
            writer.writeString(RESPONSE_FIELDS[0], value.title)
            writer.writeString(RESPONSE_FIELDS[1], value.__typename)
          }
        }
      }
    }

    object OtherCollection : ResponseAdapter<GetPage.Data.Collection.OtherCollection> {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forList("items", "items", null, false, null)
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          GetPage.Data.Collection.OtherCollection {
        return reader.run {
          var __typename: String? = __typename
          var items: List<GetPage.Data.Collection.OtherCollection.Item>? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              1 -> items = readList<GetPage.Data.Collection.OtherCollection.Item>(RESPONSE_FIELDS[1]) { reader ->
                reader.readObject<GetPage.Data.Collection.OtherCollection.Item> { reader ->
                  Item.fromResponse(reader)
                }
              }?.map { it!! }
              else -> break
            }
          }
          GetPage.Data.Collection.OtherCollection(
            __typename = __typename!!,
            items = items!!
          )
        }
      }

      override fun toResponse(writer: ResponseWriter,
          value: GetPage.Data.Collection.OtherCollection) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
        writer.writeList(RESPONSE_FIELDS[1], value.items) { value, listItemWriter ->
          listItemWriter.writeObject { writer ->
            Item.toResponse(writer, value)
          }
        }
      }

      object Item : ResponseAdapter<GetPage.Data.Collection.OtherCollection.Item> {
        private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("title", "title", null, false, null)
        )

        override fun fromResponse(reader: ResponseReader, __typename: String?):
            GetPage.Data.Collection.OtherCollection.Item {
          return reader.run {
            var title: String? = null
            while(true) {
              when (selectField(RESPONSE_FIELDS)) {
                0 -> title = readString(RESPONSE_FIELDS[0])
                else -> break
              }
            }
            GetPage.Data.Collection.OtherCollection.Item(
              title = title!!
            )
          }
        }

        override fun toResponse(writer: ResponseWriter,
            value: GetPage.Data.Collection.OtherCollection.Item) {
          writer.writeString(RESPONSE_FIELDS[0], value.title)
        }
      }
    }
  }
}
