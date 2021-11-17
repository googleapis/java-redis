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

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.v1beta1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Unique name of the resource in this scope including project and
   * location using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * Note: Redis instances are managed and addressed at regional level so
   * location_id here refers to a GCP region; however, users may choose which
   * specific zone (or collection of zones for cross-zone instances) an instance
   * should be provisioned in. Refer to
   * [location_id][google.cloud.redis.v1beta1.Instance.location_id] and
   * [alternative_location_id][google.cloud.redis.v1beta1.Instance.alternative_location_id]
   * fields for more details.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Unique name of the resource in this scope including project and
   * location using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * Note: Redis instances are managed and addressed at regional level so
   * location_id here refers to a GCP region; however, users may choose which
   * specific zone (or collection of zones for cross-zone instances) an instance
   * should be provisioned in. Refer to
   * [location_id][google.cloud.redis.v1beta1.Instance.location_id] and
   * [alternative_location_id][google.cloud.redis.v1beta1.Instance.alternative_location_id]
   * fields for more details.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * An arbitrary and optional user-provided name for the instance.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * An arbitrary and optional user-provided name for the instance.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The zone where the instance will be provisioned. If not provided,
   * the service will choose a zone from the specified region for the instance.
   * For standard tier, additional nodes will be added across multiple zones for
   * protection against zonal failures. If specified, at least one node will be
   * provisioned in this zone.
   * </pre>
   *
   * <code>string location_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * Optional. The zone where the instance will be provisioned. If not provided,
   * the service will choose a zone from the specified region for the instance.
   * For standard tier, additional nodes will be added across multiple zones for
   * protection against zonal failures. If specified, at least one node will be
   * provisioned in this zone.
   * </pre>
   *
   * <code>string location_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. If specified, at least one node will be provisioned in this zone
   * in addition to the zone specified in location_id. Only applicable to
   * standard tier. If provided, it must be a different zone from the one
   * provided in [location_id]. Additional nodes beyond the first 2 will be
   * placed in zones selected by the service.
   * </pre>
   *
   * <code>string alternative_location_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The alternativeLocationId.
   */
  java.lang.String getAlternativeLocationId();
  /**
   *
   *
   * <pre>
   * Optional. If specified, at least one node will be provisioned in this zone
   * in addition to the zone specified in location_id. Only applicable to
   * standard tier. If provided, it must be a different zone from the one
   * provided in [location_id]. Additional nodes beyond the first 2 will be
   * placed in zones selected by the service.
   * </pre>
   *
   * <code>string alternative_location_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for alternativeLocationId.
   */
  com.google.protobuf.ByteString getAlternativeLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The version of Redis software.
   * If not provided, latest supported version will be used. Currently, the
   * supported values are:
   *  *   `REDIS_3_2` for Redis 3.2 compatibility
   *  *   `REDIS_4_0` for Redis 4.0 compatibility (default)
   *  *   `REDIS_5_0` for Redis 5.0 compatibility
   *  *   `REDIS_6_X` for Redis 6.x compatibility
   * </pre>
   *
   * <code>string redis_version = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The redisVersion.
   */
  java.lang.String getRedisVersion();
  /**
   *
   *
   * <pre>
   * Optional. The version of Redis software.
   * If not provided, latest supported version will be used. Currently, the
   * supported values are:
   *  *   `REDIS_3_2` for Redis 3.2 compatibility
   *  *   `REDIS_4_0` for Redis 4.0 compatibility (default)
   *  *   `REDIS_5_0` for Redis 5.0 compatibility
   *  *   `REDIS_6_X` for Redis 6.x compatibility
   * </pre>
   *
   * <code>string redis_version = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for redisVersion.
   */
  com.google.protobuf.ByteString getRedisVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses
   * that are reserved for this instance. Range must
   * be unique and non-overlapping with existing subnets in an authorized
   * network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP
   * address ranges associated with this private service access connection.
   * If not provided, the service will choose an unused /29 block, for
   * example, 10.0.0.0/29 or 192.168.0.0/29. For READ_REPLICAS_ENABLED
   * the default block size is /28.
   * </pre>
   *
   * <code>string reserved_ip_range = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The reservedIpRange.
   */
  java.lang.String getReservedIpRange();
  /**
   *
   *
   * <pre>
   * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses
   * that are reserved for this instance. Range must
   * be unique and non-overlapping with existing subnets in an authorized
   * network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP
   * address ranges associated with this private service access connection.
   * If not provided, the service will choose an unused /29 block, for
   * example, 10.0.0.0/29 or 192.168.0.0/29. For READ_REPLICAS_ENABLED
   * the default block size is /28.
   * </pre>
   *
   * <code>string reserved_ip_range = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for reservedIpRange.
   */
  com.google.protobuf.ByteString getReservedIpRangeBytes();

  /**
   *
   *
   * <pre>
   * Output only. Hostname or IP address of the exposed Redis endpoint used by
   *  clients to connect to the service.
   * </pre>
   *
   * <code>string host = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The host.
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * Output only. Hostname or IP address of the exposed Redis endpoint used by
   *  clients to connect to the service.
   * </pre>
   *
   * <code>string host = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   *
   *
   * <pre>
   * Output only. The port number of the exposed Redis endpoint.
   * </pre>
   *
   * <code>int32 port = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * Output only. The current zone where the Redis primary node is located. In
   * basic tier, this will always be the same as [location_id]. In
   * standard tier, this can be the zone of any node in the instance.
   * </pre>
   *
   * <code>string current_location_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The currentLocationId.
   */
  java.lang.String getCurrentLocationId();
  /**
   *
   *
   * <pre>
   * Output only. The current zone where the Redis primary node is located. In
   * basic tier, this will always be the same as [location_id]. In
   * standard tier, this can be the zone of any node in the instance.
   * </pre>
   *
   * <code>string current_location_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for currentLocationId.
   */
  com.google.protobuf.ByteString getCurrentLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of this instance.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.State state = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of this instance.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.State state = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.redis.v1beta1.Instance.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current status of this
   * instance, if available.
   * </pre>
   *
   * <code>string status_message = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current status of this
   * instance, if available.
   * </pre>
   *
   * <code>string status_message = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();

  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis version 3.2 and newer:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis version 4.0 and newer:
   *  *   activedefrag
   *  *   lfu-decay-time
   *  *   lfu-log-factor
   *  *   maxmemory-gb
   *  Redis version 5.0 and newer:
   *  *   stream-node-max-bytes
   *  *   stream-node-max-entries
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getRedisConfigsCount();
  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis version 3.2 and newer:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis version 4.0 and newer:
   *  *   activedefrag
   *  *   lfu-decay-time
   *  *   lfu-log-factor
   *  *   maxmemory-gb
   *  Redis version 5.0 and newer:
   *  *   stream-node-max-bytes
   *  *   stream-node-max-entries
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsRedisConfigs(java.lang.String key);
  /** Use {@link #getRedisConfigsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getRedisConfigs();
  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis version 3.2 and newer:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis version 4.0 and newer:
   *  *   activedefrag
   *  *   lfu-decay-time
   *  *   lfu-log-factor
   *  *   maxmemory-gb
   *  Redis version 5.0 and newer:
   *  *   stream-node-max-bytes
   *  *   stream-node-max-entries
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getRedisConfigsMap();
  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis version 3.2 and newer:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis version 4.0 and newer:
   *  *   activedefrag
   *  *   lfu-decay-time
   *  *   lfu-log-factor
   *  *   maxmemory-gb
   *  Redis version 5.0 and newer:
   *  *   stream-node-max-bytes
   *  *   stream-node-max-entries
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getRedisConfigsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis version 3.2 and newer:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis version 4.0 and newer:
   *  *   activedefrag
   *  *   lfu-decay-time
   *  *   lfu-log-factor
   *  *   maxmemory-gb
   *  Redis version 5.0 and newer:
   *  *   stream-node-max-bytes
   *  *   stream-node-max-entries
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getRedisConfigsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. The service tier of the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.Tier tier = 17 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for tier.
   */
  int getTierValue();
  /**
   *
   *
   * <pre>
   * Required. The service tier of the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.Tier tier = 17 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tier.
   */
  com.google.cloud.redis.v1beta1.Instance.Tier getTier();

  /**
   *
   *
   * <pre>
   * Required. Redis memory size in GiB.
   * </pre>
   *
   * <code>int32 memory_size_gb = 18 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The memorySizeGb.
   */
  int getMemorySizeGb();

  /**
   *
   *
   * <pre>
   * Optional. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/vpc/docs/vpc) to which the
   * instance is connected. If left unspecified, the `default` network
   * will be used.
   * </pre>
   *
   * <code>string authorized_network = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The authorizedNetwork.
   */
  java.lang.String getAuthorizedNetwork();
  /**
   *
   *
   * <pre>
   * Optional. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/vpc/docs/vpc) to which the
   * instance is connected. If left unspecified, the `default` network
   * will be used.
   * </pre>
   *
   * <code>string authorized_network = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for authorizedNetwork.
   */
  com.google.protobuf.ByteString getAuthorizedNetworkBytes();

  /**
   *
   *
   * <pre>
   * Output only. Cloud IAM identity used by import / export operations to
   * transfer data to/from Cloud Storage. Format is
   * "serviceAccount:&lt;service_account_email&gt;". The value may change over time
   * for a given instance so should be checked before each import/export
   * operation.
   * </pre>
   *
   * <code>string persistence_iam_identity = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The persistenceIamIdentity.
   */
  java.lang.String getPersistenceIamIdentity();
  /**
   *
   *
   * <pre>
   * Output only. Cloud IAM identity used by import / export operations to
   * transfer data to/from Cloud Storage. Format is
   * "serviceAccount:&lt;service_account_email&gt;". The value may change over time
   * for a given instance so should be checked before each import/export
   * operation.
   * </pre>
   *
   * <code>string persistence_iam_identity = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for persistenceIamIdentity.
   */
  com.google.protobuf.ByteString getPersistenceIamIdentityBytes();

  /**
   *
   *
   * <pre>
   * Optional. The network connect mode of the Redis instance.
   * If not provided, the connect mode defaults to DIRECT_PEERING.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.ConnectMode connect_mode = 22 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for connectMode.
   */
  int getConnectModeValue();
  /**
   *
   *
   * <pre>
   * Optional. The network connect mode of the Redis instance.
   * If not provided, the connect mode defaults to DIRECT_PEERING.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.ConnectMode connect_mode = 22 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The connectMode.
   */
  com.google.cloud.redis.v1beta1.Instance.ConnectMode getConnectMode();

  /**
   *
   *
   * <pre>
   * Optional. The number of replica nodes. Valid range for standard tier
   * is [1-5] and defaults to 1. Valid value for basic tier is 0 and defaults
   * to 0.
   * </pre>
   *
   * <code>int32 replica_count = 31 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The replicaCount.
   */
  int getReplicaCount();

  /**
   *
   *
   * <pre>
   * Output only. Info per node.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.v1beta1.NodeInfo nodes = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.redis.v1beta1.NodeInfo> getNodesList();
  /**
   *
   *
   * <pre>
   * Output only. Info per node.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.v1beta1.NodeInfo nodes = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.v1beta1.NodeInfo getNodes(int index);
  /**
   *
   *
   * <pre>
   * Output only. Info per node.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.v1beta1.NodeInfo nodes = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getNodesCount();
  /**
   *
   *
   * <pre>
   * Output only. Info per node.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.v1beta1.NodeInfo nodes = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.redis.v1beta1.NodeInfoOrBuilder>
      getNodesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Info per node.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.v1beta1.NodeInfo nodes = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.v1beta1.NodeInfoOrBuilder getNodesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Hostname or IP address of the exposed readonly Redis
   * endpoint. Standard tier only. Targets all healthy replica nodes in
   * instance. Replication is asynchronous and replica nodes will exhibit some
   * lag behind the primary. Write requests must target 'host'.
   * </pre>
   *
   * <code>string read_endpoint = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The readEndpoint.
   */
  java.lang.String getReadEndpoint();
  /**
   *
   *
   * <pre>
   * Output only. Hostname or IP address of the exposed readonly Redis
   * endpoint. Standard tier only. Targets all healthy replica nodes in
   * instance. Replication is asynchronous and replica nodes will exhibit some
   * lag behind the primary. Write requests must target 'host'.
   * </pre>
   *
   * <code>string read_endpoint = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for readEndpoint.
   */
  com.google.protobuf.ByteString getReadEndpointBytes();

  /**
   *
   *
   * <pre>
   * Output only. The port number of the exposed readonly redis
   * endpoint. Standard tier only. Write requests should target 'port'.
   * </pre>
   *
   * <code>int32 read_endpoint_port = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The readEndpointPort.
   */
  int getReadEndpointPort();

  /**
   *
   *
   * <pre>
   * Optional. Read replica mode.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.ReadReplicasMode read_replicas_mode = 35 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for readReplicasMode.
   */
  int getReadReplicasModeValue();
  /**
   *
   *
   * <pre>
   * Optional. Read replica mode.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.ReadReplicasMode read_replicas_mode = 35 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The readReplicasMode.
   */
  com.google.cloud.redis.v1beta1.Instance.ReadReplicasMode getReadReplicasMode();
}
