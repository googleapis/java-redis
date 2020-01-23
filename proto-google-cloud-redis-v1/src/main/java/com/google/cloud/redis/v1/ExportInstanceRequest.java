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
// source: google/cloud/redis/v1/cloud_redis.proto

package com.google.cloud.redis.v1;

/**
 *
 *
 * <pre>
 * Request for [Export][google.cloud.redis.v1.CloudRedis.ExportInstance].
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.v1.ExportInstanceRequest}
 */
public final class ExportInstanceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.v1.ExportInstanceRequest)
    ExportInstanceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExportInstanceRequest.newBuilder() to construct.
  private ExportInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportInstanceRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExportInstanceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ExportInstanceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.redis.v1.OutputConfig.Builder subBuilder = null;
              if (outputConfig_ != null) {
                subBuilder = outputConfig_.toBuilder();
              }
              outputConfig_ =
                  input.readMessage(
                      com.google.cloud.redis.v1.OutputConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(outputConfig_);
                outputConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
        .internal_static_google_cloud_redis_v1_ExportInstanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
        .internal_static_google_cloud_redis_v1_ExportInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.v1.ExportInstanceRequest.class,
            com.google.cloud.redis.v1.ExportInstanceRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUT_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.redis.v1.OutputConfig outputConfig_;
  /**
   *
   *
   * <pre>
   * Required. Specify data to be exported.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the outputConfig field is set.
   */
  public boolean hasOutputConfig() {
    return outputConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Specify data to be exported.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The outputConfig.
   */
  public com.google.cloud.redis.v1.OutputConfig getOutputConfig() {
    return outputConfig_ == null
        ? com.google.cloud.redis.v1.OutputConfig.getDefaultInstance()
        : outputConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. Specify data to be exported.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.redis.v1.OutputConfigOrBuilder getOutputConfigOrBuilder() {
    return getOutputConfig();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (outputConfig_ != null) {
      output.writeMessage(3, getOutputConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (outputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getOutputConfig());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.redis.v1.ExportInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.v1.ExportInstanceRequest other =
        (com.google.cloud.redis.v1.ExportInstanceRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasOutputConfig() != other.hasOutputConfig()) return false;
    if (hasOutputConfig()) {
      if (!getOutputConfig().equals(other.getOutputConfig())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasOutputConfig()) {
      hash = (37 * hash) + OUTPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getOutputConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.redis.v1.ExportInstanceRequest prototype) {
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
   * Request for [Export][google.cloud.redis.v1.CloudRedis.ExportInstance].
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.v1.ExportInstanceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.v1.ExportInstanceRequest)
      com.google.cloud.redis.v1.ExportInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_ExportInstanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_ExportInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.v1.ExportInstanceRequest.class,
              com.google.cloud.redis.v1.ExportInstanceRequest.Builder.class);
    }

    // Construct using com.google.cloud.redis.v1.ExportInstanceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (outputConfigBuilder_ == null) {
        outputConfig_ = null;
      } else {
        outputConfig_ = null;
        outputConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_ExportInstanceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.ExportInstanceRequest getDefaultInstanceForType() {
      return com.google.cloud.redis.v1.ExportInstanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.ExportInstanceRequest build() {
      com.google.cloud.redis.v1.ExportInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.ExportInstanceRequest buildPartial() {
      com.google.cloud.redis.v1.ExportInstanceRequest result =
          new com.google.cloud.redis.v1.ExportInstanceRequest(this);
      result.name_ = name_;
      if (outputConfigBuilder_ == null) {
        result.outputConfig_ = outputConfig_;
      } else {
        result.outputConfig_ = outputConfigBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.redis.v1.ExportInstanceRequest) {
        return mergeFrom((com.google.cloud.redis.v1.ExportInstanceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.v1.ExportInstanceRequest other) {
      if (other == com.google.cloud.redis.v1.ExportInstanceRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasOutputConfig()) {
        mergeOutputConfig(other.getOutputConfig());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.redis.v1.ExportInstanceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.redis.v1.ExportInstanceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.redis.v1.OutputConfig outputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.v1.OutputConfig,
            com.google.cloud.redis.v1.OutputConfig.Builder,
            com.google.cloud.redis.v1.OutputConfigOrBuilder>
        outputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Specify data to be exported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the outputConfig field is set.
     */
    public boolean hasOutputConfig() {
      return outputConfigBuilder_ != null || outputConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be exported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The outputConfig.
     */
    public com.google.cloud.redis.v1.OutputConfig getOutputConfig() {
      if (outputConfigBuilder_ == null) {
        return outputConfig_ == null
            ? com.google.cloud.redis.v1.OutputConfig.getDefaultInstance()
            : outputConfig_;
      } else {
        return outputConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be exported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setOutputConfig(com.google.cloud.redis.v1.OutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        outputConfig_ = value;
        onChanged();
      } else {
        outputConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be exported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setOutputConfig(com.google.cloud.redis.v1.OutputConfig.Builder builderForValue) {
      if (outputConfigBuilder_ == null) {
        outputConfig_ = builderForValue.build();
        onChanged();
      } else {
        outputConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be exported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeOutputConfig(com.google.cloud.redis.v1.OutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (outputConfig_ != null) {
          outputConfig_ =
              com.google.cloud.redis.v1.OutputConfig.newBuilder(outputConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          outputConfig_ = value;
        }
        onChanged();
      } else {
        outputConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be exported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearOutputConfig() {
      if (outputConfigBuilder_ == null) {
        outputConfig_ = null;
        onChanged();
      } else {
        outputConfig_ = null;
        outputConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be exported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.redis.v1.OutputConfig.Builder getOutputConfigBuilder() {

      onChanged();
      return getOutputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be exported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.redis.v1.OutputConfigOrBuilder getOutputConfigOrBuilder() {
      if (outputConfigBuilder_ != null) {
        return outputConfigBuilder_.getMessageOrBuilder();
      } else {
        return outputConfig_ == null
            ? com.google.cloud.redis.v1.OutputConfig.getDefaultInstance()
            : outputConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be exported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.v1.OutputConfig,
            com.google.cloud.redis.v1.OutputConfig.Builder,
            com.google.cloud.redis.v1.OutputConfigOrBuilder>
        getOutputConfigFieldBuilder() {
      if (outputConfigBuilder_ == null) {
        outputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.redis.v1.OutputConfig,
                com.google.cloud.redis.v1.OutputConfig.Builder,
                com.google.cloud.redis.v1.OutputConfigOrBuilder>(
                getOutputConfig(), getParentForChildren(), isClean());
        outputConfig_ = null;
      }
      return outputConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.redis.v1.ExportInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.v1.ExportInstanceRequest)
  private static final com.google.cloud.redis.v1.ExportInstanceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.v1.ExportInstanceRequest();
  }

  public static com.google.cloud.redis.v1.ExportInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportInstanceRequest> PARSER =
      new com.google.protobuf.AbstractParser<ExportInstanceRequest>() {
        @java.lang.Override
        public ExportInstanceRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ExportInstanceRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ExportInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportInstanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.v1.ExportInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
