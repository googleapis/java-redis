/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1beta1/cloud_redis.proto

package com.google.cloud.redis.v1beta1;

/**
 *
 *
 * <pre>
 * The output content
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.v1beta1.OutputConfig}
 */
public final class OutputConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.v1beta1.OutputConfig)
    OutputConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OutputConfig.newBuilder() to construct.
  private OutputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OutputConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OutputConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
        .internal_static_google_cloud_redis_v1beta1_OutputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
        .internal_static_google_cloud_redis_v1beta1_OutputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.v1beta1.OutputConfig.class,
            com.google.cloud.redis.v1beta1.OutputConfig.Builder.class);
  }

  private int destinationCase_ = 0;
  private java.lang.Object destination_;

  public enum DestinationCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_DESTINATION(1),
    DESTINATION_NOT_SET(0);
    private final int value;

    private DestinationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DestinationCase valueOf(int value) {
      return forNumber(value);
    }

    public static DestinationCase forNumber(int value) {
      switch (value) {
        case 1:
          return GCS_DESTINATION;
        case 0:
          return DESTINATION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DestinationCase getDestinationCase() {
    return DestinationCase.forNumber(destinationCase_);
  }

  public static final int GCS_DESTINATION_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Google Cloud Storage destination for output content.
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  @java.lang.Override
  public boolean hasGcsDestination() {
    return destinationCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Google Cloud Storage destination for output content.
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  @java.lang.Override
  public com.google.cloud.redis.v1beta1.GcsDestination getGcsDestination() {
    if (destinationCase_ == 1) {
      return (com.google.cloud.redis.v1beta1.GcsDestination) destination_;
    }
    return com.google.cloud.redis.v1beta1.GcsDestination.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Google Cloud Storage destination for output content.
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.redis.v1beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder() {
    if (destinationCase_ == 1) {
      return (com.google.cloud.redis.v1beta1.GcsDestination) destination_;
    }
    return com.google.cloud.redis.v1beta1.GcsDestination.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (destinationCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.redis.v1beta1.GcsDestination) destination_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (destinationCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.redis.v1beta1.GcsDestination) destination_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.redis.v1beta1.OutputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.v1beta1.OutputConfig other =
        (com.google.cloud.redis.v1beta1.OutputConfig) obj;

    if (!getDestinationCase().equals(other.getDestinationCase())) return false;
    switch (destinationCase_) {
      case 1:
        if (!getGcsDestination().equals(other.getGcsDestination())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (destinationCase_) {
      case 1:
        hash = (37 * hash) + GCS_DESTINATION_FIELD_NUMBER;
        hash = (53 * hash) + getGcsDestination().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.redis.v1beta1.OutputConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The output content
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.v1beta1.OutputConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.v1beta1.OutputConfig)
      com.google.cloud.redis.v1beta1.OutputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
          .internal_static_google_cloud_redis_v1beta1_OutputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
          .internal_static_google_cloud_redis_v1beta1_OutputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.v1beta1.OutputConfig.class,
              com.google.cloud.redis.v1beta1.OutputConfig.Builder.class);
    }

    // Construct using com.google.cloud.redis.v1beta1.OutputConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gcsDestinationBuilder_ != null) {
        gcsDestinationBuilder_.clear();
      }
      destinationCase_ = 0;
      destination_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
          .internal_static_google_cloud_redis_v1beta1_OutputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.OutputConfig getDefaultInstanceForType() {
      return com.google.cloud.redis.v1beta1.OutputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.OutputConfig build() {
      com.google.cloud.redis.v1beta1.OutputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.OutputConfig buildPartial() {
      com.google.cloud.redis.v1beta1.OutputConfig result =
          new com.google.cloud.redis.v1beta1.OutputConfig(this);
      if (destinationCase_ == 1) {
        if (gcsDestinationBuilder_ == null) {
          result.destination_ = destination_;
        } else {
          result.destination_ = gcsDestinationBuilder_.build();
        }
      }
      result.destinationCase_ = destinationCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.redis.v1beta1.OutputConfig) {
        return mergeFrom((com.google.cloud.redis.v1beta1.OutputConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.v1beta1.OutputConfig other) {
      if (other == com.google.cloud.redis.v1beta1.OutputConfig.getDefaultInstance()) return this;
      switch (other.getDestinationCase()) {
        case GCS_DESTINATION:
          {
            mergeGcsDestination(other.getGcsDestination());
            break;
          }
        case DESTINATION_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getGcsDestinationFieldBuilder().getBuilder(), extensionRegistry);
                destinationCase_ = 1;
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int destinationCase_ = 0;
    private java.lang.Object destination_;

    public DestinationCase getDestinationCase() {
      return DestinationCase.forNumber(destinationCase_);
    }

    public Builder clearDestination() {
      destinationCase_ = 0;
      destination_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.v1beta1.GcsDestination,
            com.google.cloud.redis.v1beta1.GcsDestination.Builder,
            com.google.cloud.redis.v1beta1.GcsDestinationOrBuilder>
        gcsDestinationBuilder_;
    /**
     *
     *
     * <pre>
     * Google Cloud Storage destination for output content.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
     *
     * @return Whether the gcsDestination field is set.
     */
    @java.lang.Override
    public boolean hasGcsDestination() {
      return destinationCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage destination for output content.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
     *
     * @return The gcsDestination.
     */
    @java.lang.Override
    public com.google.cloud.redis.v1beta1.GcsDestination getGcsDestination() {
      if (gcsDestinationBuilder_ == null) {
        if (destinationCase_ == 1) {
          return (com.google.cloud.redis.v1beta1.GcsDestination) destination_;
        }
        return com.google.cloud.redis.v1beta1.GcsDestination.getDefaultInstance();
      } else {
        if (destinationCase_ == 1) {
          return gcsDestinationBuilder_.getMessage();
        }
        return com.google.cloud.redis.v1beta1.GcsDestination.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage destination for output content.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
     */
    public Builder setGcsDestination(com.google.cloud.redis.v1beta1.GcsDestination value) {
      if (gcsDestinationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        destination_ = value;
        onChanged();
      } else {
        gcsDestinationBuilder_.setMessage(value);
      }
      destinationCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage destination for output content.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
     */
    public Builder setGcsDestination(
        com.google.cloud.redis.v1beta1.GcsDestination.Builder builderForValue) {
      if (gcsDestinationBuilder_ == null) {
        destination_ = builderForValue.build();
        onChanged();
      } else {
        gcsDestinationBuilder_.setMessage(builderForValue.build());
      }
      destinationCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage destination for output content.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
     */
    public Builder mergeGcsDestination(com.google.cloud.redis.v1beta1.GcsDestination value) {
      if (gcsDestinationBuilder_ == null) {
        if (destinationCase_ == 1
            && destination_ != com.google.cloud.redis.v1beta1.GcsDestination.getDefaultInstance()) {
          destination_ =
              com.google.cloud.redis.v1beta1.GcsDestination.newBuilder(
                      (com.google.cloud.redis.v1beta1.GcsDestination) destination_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          destination_ = value;
        }
        onChanged();
      } else {
        if (destinationCase_ == 1) {
          gcsDestinationBuilder_.mergeFrom(value);
        }
        gcsDestinationBuilder_.setMessage(value);
      }
      destinationCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage destination for output content.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
     */
    public Builder clearGcsDestination() {
      if (gcsDestinationBuilder_ == null) {
        if (destinationCase_ == 1) {
          destinationCase_ = 0;
          destination_ = null;
          onChanged();
        }
      } else {
        if (destinationCase_ == 1) {
          destinationCase_ = 0;
          destination_ = null;
        }
        gcsDestinationBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage destination for output content.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
     */
    public com.google.cloud.redis.v1beta1.GcsDestination.Builder getGcsDestinationBuilder() {
      return getGcsDestinationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage destination for output content.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.redis.v1beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder() {
      if ((destinationCase_ == 1) && (gcsDestinationBuilder_ != null)) {
        return gcsDestinationBuilder_.getMessageOrBuilder();
      } else {
        if (destinationCase_ == 1) {
          return (com.google.cloud.redis.v1beta1.GcsDestination) destination_;
        }
        return com.google.cloud.redis.v1beta1.GcsDestination.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage destination for output content.
     * </pre>
     *
     * <code>.google.cloud.redis.v1beta1.GcsDestination gcs_destination = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.v1beta1.GcsDestination,
            com.google.cloud.redis.v1beta1.GcsDestination.Builder,
            com.google.cloud.redis.v1beta1.GcsDestinationOrBuilder>
        getGcsDestinationFieldBuilder() {
      if (gcsDestinationBuilder_ == null) {
        if (!(destinationCase_ == 1)) {
          destination_ = com.google.cloud.redis.v1beta1.GcsDestination.getDefaultInstance();
        }
        gcsDestinationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.redis.v1beta1.GcsDestination,
                com.google.cloud.redis.v1beta1.GcsDestination.Builder,
                com.google.cloud.redis.v1beta1.GcsDestinationOrBuilder>(
                (com.google.cloud.redis.v1beta1.GcsDestination) destination_,
                getParentForChildren(),
                isClean());
        destination_ = null;
      }
      destinationCase_ = 1;
      onChanged();
      ;
      return gcsDestinationBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.redis.v1beta1.OutputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.v1beta1.OutputConfig)
  private static final com.google.cloud.redis.v1beta1.OutputConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.v1beta1.OutputConfig();
  }

  public static com.google.cloud.redis.v1beta1.OutputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OutputConfig> PARSER =
      new com.google.protobuf.AbstractParser<OutputConfig>() {
        @java.lang.Override
        public OutputConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<OutputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OutputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.v1beta1.OutputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
