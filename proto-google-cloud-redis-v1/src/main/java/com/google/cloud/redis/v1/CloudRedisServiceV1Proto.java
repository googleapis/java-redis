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

public final class CloudRedisServiceV1Proto {
  private CloudRedisServiceV1Proto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_NodeInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_NodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_ListInstancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_ListInstancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_CreateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_UpdateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_DeleteInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_InputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_ImportInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_ImportInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_ExportInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_ExportInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_FailoverInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_FailoverInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_LocationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_LocationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_ZoneMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_ZoneMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "\'google/cloud/redis/v1/cloud_redis.prot"
          + "o\022\025google.cloud.redis.v1\032\034google/api/ann"
          + "otations.proto\032\027google/api/client.proto\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032#google/longrunning/operations.proto\032 google/protobuf/field_"
          + "mask.proto\032\037google/protobuf/timestamp.proto\".\n"
          + "\010NodeInfo\022\017\n"
          + "\002id\030\001 \001(\tB\003\340A\003\022\021\n"
          + "\004zone\030\002 \001(\tB\003\340A\003\"\273\014\n"
          + "\010Instance\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\022\024\n"
          + "\014display_name\030\002 \001(\t\022;\n"
          + "\006labels\030\003 \003(\0132+.google.cloud.redis.v1.Instance.LabelsEntry\022\030\n"
          + "\013location_id\030\004 \001(\tB\003\340A\001\022$\n"
          + "\027alternative_location_id\030\005 \001(\tB\003\340A\001\022\032\n\r"
          + "redis_version\030\007 \001(\tB\003\340A\001\022\036\n"
          + "\021reserved_ip_range\030\t \001(\tB\003\340A\001\022\021\n"
          + "\004host\030\n"
          + " \001(\tB\003\340A\003\022\021\n"
          + "\004port\030\013 \001(\005B\003\340A\003\022 \n"
          + "\023current_location_id\030\014 \001(\tB\003\340A\003\0224\n"
          + "\013create_time\030\r"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0229\n"
          + "\005state\030\016"
          + " \001(\0162%.google.cloud.redis.v1.Instance.StateB\003\340A\003\022\033\n"
          + "\016status_message\030\017 \001(\tB\003\340A\003\022M\n\r"
          + "redis_configs\030\020"
          + " \003(\01321.google.cloud.redis.v1.Instance.RedisConfigsEntryB\003\340A\001\0227\n"
          + "\004tier\030\021 \001(\0162$."
          + "google.cloud.redis.v1.Instance.TierB\003\340A\002\022\033\n"
          + "\016memory_size_gb\030\022 \001(\005B\003\340A\002\022\037\n"
          + "\022authorized_network\030\024 \001(\tB\003\340A\001\022%\n"
          + "\030persistence_iam_identity\030\025 \001(\tB\003\340A\003\022F\n"
          + "\014connect_mode\030\026 "
          + "\001(\0162+.google.cloud.redis.v1.Instance.ConnectModeB\003\340A\001\022\032\n\r"
          + "replica_count\030\037 \001(\005B\003\340A\001\0223\n"
          + "\005nodes\030  \003(\0132\037.google.cloud.redis.v1.NodeInfoB\003\340A\003\022\032\n\r"
          + "read_endpoint\030! \001(\tB\003\340A\003\022\037\n"
          + "\022read_endpoint_port\030\" \001(\005B\003\340A\003\022Q\n"
          + "\022read_replicas_mode\030# \001(\01620.google.cloud.r"
          + "edis.v1.Instance.ReadReplicasModeB\003\340A\001\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\0323\n"
          + "\021RedisConfigsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"\224\001\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\014\n"
          + "\010CREATING\020\001\022\t\n"
          + "\005READY\020\002\022\014\n"
          + "\010UPDATING\020\003\022\014\n"
          + "\010DELETING\020\004\022\r\n"
          + "\tREPAIRING\020\005\022\017\n"
          + "\013MAINTENANCE\020\006\022\r\n"
          + "\tIMPORTING\020\010\022\020\n"
          + "\014FAILING_OVER\020\t\"8\n"
          + "\004Tier\022\024\n"
          + "\020TIER_UNSPECIFIED\020\000\022\t\n"
          + "\005BASIC\020\001\022\017\n"
          + "\013STANDARD_HA\020\003\"[\n"
          + "\013ConnectMode\022\034\n"
          + "\030CONNECT_MODE_UNSPECIFIED\020\000\022\022\n"
          + "\016DIRECT_PEERING\020\001\022\032\n"
          + "\026PRIVATE_SERVICE_ACCESS\020\002\"m\n"
          + "\020ReadReplicasMode\022\"\n"
          + "\036READ_REPLICAS_MODE_UNSPECIFIED\020\000\022\032\n"
          + "\026READ_REPLICAS_DISABLED\020\001\022\031\n"
          + "\025READ_REPLICAS_ENABLED\020\002:`\352A]\n"
          + "\035redis.googleapis.com/Instance\022<projects/{p"
          + "roject}/locations/{location}/instances/{instance}\"x\n"
          + "\024ListInstancesRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\"y\n"
          + "\025ListInstancesResponse\0222\n"
          + "\tinstances\030\001 \003(\0132\037.google.cloud.redis.v1.Instance\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n"
          + "\013unreachable\030\003 \003(\t\"I\n"
          + "\022GetInstanceRequest\0223\n"
          + "\004name\030\001 \001(\tB%\340A\002\372A\037\n"
          + "\035redis.googleapis.com/Instance\"\244\001\n"
          + "\025CreateInstanceRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\022\030\n"
          + "\013instance_id\030\002 \001(\tB\003\340A\002\0226\n"
          + "\010instance\030\003"
          + " \001(\0132\037.google.cloud.redis.v1.InstanceB\003\340A\002\"\205\001\n"
          + "\025UpdateInstanceRequest\0224\n"
          + "\013update_mask\030\001 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\0226\n"
          + "\010instance\030\002 \001(\0132\037.google.cloud.redis.v1.InstanceB\003\340A\002\"i\n"
          + "\026UpgradeInstanceRequest\0223\n"
          + "\004name\030\001 \001(\tB%\340A\002\372A\037\n"
          + "\035redis.googleapis.com/Instance\022\032\n\r"
          + "redis_version\030\002 \001(\tB\003\340A\002\"L\n"
          + "\025DeleteInstanceRequest\0223\n"
          + "\004name\030\001 \001(\tB%\340A\002\372A\037\n"
          + "\035redis.googleapis.com/Instance\"\035\n"
          + "\tGcsSource\022\020\n"
          + "\003uri\030\001 \001(\tB\003\340A\002\"O\n"
          + "\013InputConfig\0226\n\n"
          + "gcs_source\030\001 \001(\0132 .google.cloud.redis.v1.GcsSourceH\000B\010\n"
          + "\006source\"i\n"
          + "\025ImportInstanceRequest\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\022=\n"
          + "\014input_config\030\003"
          + " \001(\0132\".google.cloud.redis.v1.InputConfigB\003\340A\002\"\"\n"
          + "\016GcsDestination\022\020\n"
          + "\003uri\030\001 \001(\tB\003\340A\002\"_\n"
          + "\014OutputConfig\022@\n"
          + "\017gcs_destination\030\001 \001(\0132%.google.cloud.redis.v1.GcsDestinationH\000B\r\n"
          + "\013destination\"k\n"
          + "\025ExportInstanceRequest\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\022?\n\r"
          + "output_config\030\003 \001(\0132#.g"
          + "oogle.cloud.redis.v1.OutputConfigB\003\340A\002\"\234\002\n"
          + "\027FailoverInstanceRequest\0223\n"
          + "\004name\030\001 \001(\tB%\340A\002\372A\037\n"
          + "\035redis.googleapis.com/Instance\022d\n"
          + "\024data_protection_mode\030\002 \001(\0162A.google.c"
          + "loud.redis.v1.FailoverInstanceRequest.DataProtectionModeB\003\340A\001\"f\n"
          + "\022DataProtectionMode\022$\n"
          + " DATA_PROTECTION_MODE_UNSPECIFIED\020\000\022\025\n"
          + "\021LIMITED_DATA_LOSS\020\001\022\023\n"
          + "\017FORCE_DATA_LOSS\020\002\"\326\001\n"
          + "\021OperationMetadata\022/\n"
          + "\013create_time\030\001 \001(\0132\032.google.protobuf.Timestamp\022,\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.Timestamp\022\016\n"
          + "\006target\030\003 \001(\t\022\014\n"
          + "\004verb\030\004 \001(\t\022\025\n\r"
          + "status_detail\030\005 \001(\t\022\030\n"
          + "\020cancel_requested\030\006 \001(\010\022\023\n"
          + "\013api_version\030\007 \001(\t\"\311\001\n"
          + "\020LocationMetadata\022Y\n"
          + "\017available_zones\030\001 \003(\0132;.google.cl"
          + "oud.redis.v1.LocationMetadata.AvailableZonesEntryB\003\340A\003\032Z\n"
          + "\023AvailableZonesEntry\022\013\n"
          + "\003key\030\001 \001(\t\0222\n"
          + "\005value\030\002 \001(\0132#.google.cloud.redis.v1.ZoneMetadata:\0028\001\"\016\n"
          + "\014ZoneMetadata2\263\021\n\n"
          + "CloudRedis\022\252\001\n\r"
          + "ListInstances\022+.google.cloud.redis.v1.ListInstancesRequest"
          + "\032,.google.cloud.redis.v1.ListInstancesRe"
          + "sponse\">\202\323\344\223\002/\022-/v1/{parent=projects/*/locations/*}/instances\332A\006parent\022\227\001\n"
          + "\013GetInstance\022).google.cloud.redis.v1.GetInstan"
          + "ceRequest\032\037.google.cloud.redis.v1.Instan"
          + "ce\"<\202\323\344\223\002/\022-/v1/{name=projects/*/locations/*/instances/*}\332A\004name\022\211\002\n"
          + "\016CreateInstance\022,.google.cloud.redis.v1.CreateInstan"
          + "ceRequest\032\035.google.longrunning.Operation"
          + "\"\251\001\202\323\344\223\0029\"-/v1/{parent=projects/*/locati"
          + "ons/*}/instances:\010instance\332A\033parent,instance_id,instance\312AI\n"
          + "\036google.cloud.redis."
          + "v1.Instance\022\'google.cloud.redis.v1.OperationMetadata\022\213\002\n"
          + "\016UpdateInstance\022,.google.cloud.redis.v1.UpdateInstanceRequest\032\035."
          + "google.longrunning.Operation\"\253\001\202\323\344\223\002B26/"
          + "v1/{instance.name=projects/*/locations/*"
          + "/instances/*}:\010instance\332A\024update_mask,instance\312AI\n"
          + "\036google.cloud.redis.v1.Instanc"
          + "e\022\'google.cloud.redis.v1.OperationMetadata\022\203\002\n"
          + "\017UpgradeInstance\022-.google.cloud.redis.v1.UpgradeInstanceRequest\032\035.google.l"
          + "ongrunning.Operation\"\241\001\202\323\344\223\002:\"5/v1/{name"
          + "=projects/*/locations/*/instances/*}:upgrade:\001*\332A\022name,redis_version\312AI\n"
          + "\036google."
          + "cloud.redis.v1.Instance\022\'google.cloud.redis.v1.OperationMetadata\022\377\001\n"
          + "\016ImportInstance\022,.google.cloud.redis.v1.ImportInstan"
          + "ceRequest\032\035.google.longrunning.Operation"
          + "\"\237\001\202\323\344\223\0029\"4/v1/{name=projects/*/location"
          + "s/*/instances/*}:import:\001*\332A\021name,input_config\312AI\n"
          + "\036google.cloud.redis.v1.Instanc"
          + "e\022\'google.cloud.redis.v1.OperationMetadata\022\200\002\n"
          + "\016ExportInstance\022,.google.cloud.redis.v1.ExportInstanceRequest\032\035.google.lon"
          + "grunning.Operation\"\240\001\202\323\344\223\0029\"4/v1/{name=p"
          + "rojects/*/locations/*/instances/*}:export:\001*\332A\022name,output_config\312AI\n"
          + "\036google.clo"
          + "ud.redis.v1.Instance\022\'google.cloud.redis.v1.OperationMetadata\022\215\002\n"
          + "\020FailoverInstance\022..google.cloud.redis.v1.FailoverInsta"
          + "nceRequest\032\035.google.longrunning.Operatio"
          + "n\"\251\001\202\323\344\223\002;\"6/v1/{name=projects/*/locatio"
          + "ns/*/instances/*}:failover:\001*\332A\031name,data_protection_mode\312AI\n"
          + "\036google.cloud.redis"
          + ".v1.Instance\022\'google.cloud.redis.v1.OperationMetadata\022\336\001\n"
          + "\016DeleteInstance\022,.google.cloud.redis.v1.DeleteInstanceRequest\032\035"
          + ".google.longrunning.Operation\"\177\202\323\344\223\002/*-/"
          + "v1/{name=projects/*/locations/*/instances/*}\332A\004name\312A@\n"
          + "\025google.protobuf.Empty\022\'google.cloud.redis.v1.OperationMetadata\032H"
          + "\312A\024redis.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platformBs\n"
          + "\031com.google.cloud.redis.v1B\030CloudRedisService"
          + "V1ProtoP\001Z:google.golang.org/genproto/googleapis/cloud/redis/v1;redisb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_redis_v1_NodeInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_redis_v1_NodeInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_NodeInfo_descriptor,
            new java.lang.String[] {
              "Id", "Zone",
            });
    internal_static_google_cloud_redis_v1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_redis_v1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Labels",
              "LocationId",
              "AlternativeLocationId",
              "RedisVersion",
              "ReservedIpRange",
              "Host",
              "Port",
              "CurrentLocationId",
              "CreateTime",
              "State",
              "StatusMessage",
              "RedisConfigs",
              "Tier",
              "MemorySizeGb",
              "AuthorizedNetwork",
              "PersistenceIamIdentity",
              "ConnectMode",
              "ReplicaCount",
              "Nodes",
              "ReadEndpoint",
              "ReadEndpointPort",
              "ReadReplicasMode",
            });
    internal_static_google_cloud_redis_v1_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_redis_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_redis_v1_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_descriptor =
        internal_static_google_cloud_redis_v1_Instance_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_redis_v1_ListInstancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_redis_v1_ListInstancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_ListInstancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_redis_v1_ListInstancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_redis_v1_ListInstancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_ListInstancesResponse_descriptor,
            new java.lang.String[] {
              "Instances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_redis_v1_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_redis_v1_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_redis_v1_CreateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_redis_v1_CreateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_CreateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InstanceId", "Instance",
            });
    internal_static_google_cloud_redis_v1_UpdateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_redis_v1_UpdateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_UpdateInstanceRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Instance",
            });
    internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "RedisVersion",
            });
    internal_static_google_cloud_redis_v1_DeleteInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_redis_v1_DeleteInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_DeleteInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_redis_v1_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_redis_v1_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_GcsSource_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_redis_v1_InputConfig_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_redis_v1_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_InputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "Source",
            });
    internal_static_google_cloud_redis_v1_ImportInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_redis_v1_ImportInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_ImportInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "InputConfig",
            });
    internal_static_google_cloud_redis_v1_GcsDestination_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_redis_v1_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_GcsDestination_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_redis_v1_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_redis_v1_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "Destination",
            });
    internal_static_google_cloud_redis_v1_ExportInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_redis_v1_ExportInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_ExportInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "OutputConfig",
            });
    internal_static_google_cloud_redis_v1_FailoverInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_redis_v1_FailoverInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_FailoverInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "DataProtectionMode",
            });
    internal_static_google_cloud_redis_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_redis_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "CancelRequested",
              "ApiVersion",
            });
    internal_static_google_cloud_redis_v1_LocationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_redis_v1_LocationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_LocationMetadata_descriptor,
            new java.lang.String[] {
              "AvailableZones",
            });
    internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_descriptor =
        internal_static_google_cloud_redis_v1_LocationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_redis_v1_ZoneMetadata_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_redis_v1_ZoneMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_ZoneMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
