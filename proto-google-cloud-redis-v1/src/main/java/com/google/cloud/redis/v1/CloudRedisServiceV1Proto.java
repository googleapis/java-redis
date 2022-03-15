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
      internal_static_google_cloud_redis_v1_GetInstanceAuthStringRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_GetInstanceAuthStringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_InstanceAuthString_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_InstanceAuthString_fieldAccessorTable;
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
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_TlsCertificate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_TlsCertificate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/redis/v1/cloud_redis.prot"
          + "o\022\025google.cloud.redis.v1\032\034google/api/ann"
          + "otations.proto\032\027google/api/client.proto\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032#google/longrunning/"
          + "operations.proto\032 google/protobuf/field_"
          + "mask.proto\032\037google/protobuf/timestamp.pr"
          + "oto\".\n\010NodeInfo\022\017\n\002id\030\001 \001(\tB\003\340A\003\022\021\n\004zone"
          + "\030\002 \001(\tB\003\340A\003\"\204\017\n\010Instance\022\021\n\004name\030\001 \001(\tB\003"
          + "\340A\002\022\024\n\014display_name\030\002 \001(\t\022;\n\006labels\030\003 \003("
          + "\0132+.google.cloud.redis.v1.Instance.Label"
          + "sEntry\022\030\n\013location_id\030\004 \001(\tB\003\340A\001\022$\n\027alte"
          + "rnative_location_id\030\005 \001(\tB\003\340A\001\022\032\n\rredis_"
          + "version\030\007 \001(\tB\003\340A\001\022\036\n\021reserved_ip_range\030"
          + "\t \001(\tB\003\340A\001\022\037\n\022secondary_ip_range\030\036 \001(\tB\003"
          + "\340A\001\022\021\n\004host\030\n \001(\tB\003\340A\003\022\021\n\004port\030\013 \001(\005B\003\340A"
          + "\003\022 \n\023current_location_id\030\014 \001(\tB\003\340A\003\0224\n\013c"
          + "reate_time\030\r \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\0229\n\005state\030\016 \001(\0162%.google.cloud."
          + "redis.v1.Instance.StateB\003\340A\003\022\033\n\016status_m"
          + "essage\030\017 \001(\tB\003\340A\003\022M\n\rredis_configs\030\020 \003(\013"
          + "21.google.cloud.redis.v1.Instance.RedisC"
          + "onfigsEntryB\003\340A\001\0227\n\004tier\030\021 \001(\0162$.google."
          + "cloud.redis.v1.Instance.TierB\003\340A\002\022\033\n\016mem"
          + "ory_size_gb\030\022 \001(\005B\003\340A\002\022\037\n\022authorized_net"
          + "work\030\024 \001(\tB\003\340A\001\022%\n\030persistence_iam_ident"
          + "ity\030\025 \001(\tB\003\340A\003\022F\n\014connect_mode\030\026 \001(\0162+.g"
          + "oogle.cloud.redis.v1.Instance.ConnectMod"
          + "eB\003\340A\001\022\031\n\014auth_enabled\030\027 \001(\010B\003\340A\001\022C\n\017ser"
          + "ver_ca_certs\030\031 \003(\0132%.google.cloud.redis."
          + "v1.TlsCertificateB\003\340A\003\022[\n\027transit_encryp"
          + "tion_mode\030\032 \001(\01625.google.cloud.redis.v1."
          + "Instance.TransitEncryptionModeB\003\340A\001\022\032\n\rr"
          + "eplica_count\030\037 \001(\005B\003\340A\001\0223\n\005nodes\030  \003(\0132\037"
          + ".google.cloud.redis.v1.NodeInfoB\003\340A\003\022\032\n\r"
          + "read_endpoint\030! \001(\tB\003\340A\003\022\037\n\022read_endpoin"
          + "t_port\030\" \001(\005B\003\340A\003\022Q\n\022read_replicas_mode\030"
          + "# \001(\01620.google.cloud.redis.v1.Instance.R"
          + "eadReplicasModeB\003\340A\001\032-\n\013LabelsEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0323\n\021RedisConf"
          + "igsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001"
          + "\"\224\001\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CRE"
          + "ATING\020\001\022\t\n\005READY\020\002\022\014\n\010UPDATING\020\003\022\014\n\010DELE"
          + "TING\020\004\022\r\n\tREPAIRING\020\005\022\017\n\013MAINTENANCE\020\006\022\r"
          + "\n\tIMPORTING\020\010\022\020\n\014FAILING_OVER\020\t\"8\n\004Tier\022"
          + "\024\n\020TIER_UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\017\n\013STAN"
          + "DARD_HA\020\003\"[\n\013ConnectMode\022\034\n\030CONNECT_MODE"
          + "_UNSPECIFIED\020\000\022\022\n\016DIRECT_PEERING\020\001\022\032\n\026PR"
          + "IVATE_SERVICE_ACCESS\020\002\"i\n\025TransitEncrypt"
          + "ionMode\022\'\n#TRANSIT_ENCRYPTION_MODE_UNSPE"
          + "CIFIED\020\000\022\031\n\025SERVER_AUTHENTICATION\020\001\022\014\n\010D"
          + "ISABLED\020\002\"m\n\020ReadReplicasMode\022\"\n\036READ_RE"
          + "PLICAS_MODE_UNSPECIFIED\020\000\022\032\n\026READ_REPLIC"
          + "AS_DISABLED\020\001\022\031\n\025READ_REPLICAS_ENABLED\020\002"
          + ":`\352A]\n\035redis.googleapis.com/Instance\022<pr"
          + "ojects/{project}/locations/{location}/in"
          + "stances/{instance}\"x\n\024ListInstancesReque"
          + "st\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.go"
          + "ogleapis.com/Location\022\021\n\tpage_size\030\002 \001(\005"
          + "\022\022\n\npage_token\030\003 \001(\t\"y\n\025ListInstancesRes"
          + "ponse\0222\n\tinstances\030\001 \003(\0132\037.google.cloud."
          + "redis.v1.Instance\022\027\n\017next_page_token\030\002 \001"
          + "(\t\022\023\n\013unreachable\030\003 \003(\t\"I\n\022GetInstanceRe"
          + "quest\0223\n\004name\030\001 \001(\tB%\340A\002\372A\037\n\035redis.googl"
          + "eapis.com/Instance\"S\n\034GetInstanceAuthStr"
          + "ingRequest\0223\n\004name\030\001 \001(\tB%\340A\002\372A\037\n\035redis."
          + "googleapis.com/Instance\")\n\022InstanceAuthS"
          + "tring\022\023\n\013auth_string\030\001 \001(\t\"\244\001\n\025CreateIns"
          + "tanceRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!lo"
          + "cations.googleapis.com/Location\022\030\n\013insta"
          + "nce_id\030\002 \001(\tB\003\340A\002\0226\n\010instance\030\003 \001(\0132\037.go"
          + "ogle.cloud.redis.v1.InstanceB\003\340A\002\"\205\001\n\025Up"
          + "dateInstanceRequest\0224\n\013update_mask\030\001 \001(\013"
          + "2\032.google.protobuf.FieldMaskB\003\340A\002\0226\n\010ins"
          + "tance\030\002 \001(\0132\037.google.cloud.redis.v1.Inst"
          + "anceB\003\340A\002\"i\n\026UpgradeInstanceRequest\0223\n\004n"
          + "ame\030\001 \001(\tB%\340A\002\372A\037\n\035redis.googleapis.com/"
          + "Instance\022\032\n\rredis_version\030\002 \001(\tB\003\340A\002\"L\n\025"
          + "DeleteInstanceRequest\0223\n\004name\030\001 \001(\tB%\340A\002"
          + "\372A\037\n\035redis.googleapis.com/Instance\"\035\n\tGc"
          + "sSource\022\020\n\003uri\030\001 \001(\tB\003\340A\002\"O\n\013InputConfig"
          + "\0226\n\ngcs_source\030\001 \001(\0132 .google.cloud.redi"
          + "s.v1.GcsSourceH\000B\010\n\006source\"i\n\025ImportInst"
          + "anceRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\022=\n\014input_"
          + "config\030\003 \001(\0132\".google.cloud.redis.v1.Inp"
          + "utConfigB\003\340A\002\"\"\n\016GcsDestination\022\020\n\003uri\030\001"
          + " \001(\tB\003\340A\002\"_\n\014OutputConfig\022@\n\017gcs_destina"
          + "tion\030\001 \001(\0132%.google.cloud.redis.v1.GcsDe"
          + "stinationH\000B\r\n\013destination\"k\n\025ExportInst"
          + "anceRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\022?\n\routput"
          + "_config\030\003 \001(\0132#.google.cloud.redis.v1.Ou"
          + "tputConfigB\003\340A\002\"\234\002\n\027FailoverInstanceRequ"
          + "est\0223\n\004name\030\001 \001(\tB%\340A\002\372A\037\n\035redis.googlea"
          + "pis.com/Instance\022d\n\024data_protection_mode"
          + "\030\002 \001(\0162A.google.cloud.redis.v1.FailoverI"
          + "nstanceRequest.DataProtectionModeB\003\340A\001\"f"
          + "\n\022DataProtectionMode\022$\n DATA_PROTECTION_"
          + "MODE_UNSPECIFIED\020\000\022\025\n\021LIMITED_DATA_LOSS\020"
          + "\001\022\023\n\017FORCE_DATA_LOSS\020\002\"\326\001\n\021OperationMeta"
          + "data\022/\n\013create_time\030\001 \001(\0132\032.google.proto"
          + "buf.Timestamp\022,\n\010end_time\030\002 \001(\0132\032.google"
          + ".protobuf.Timestamp\022\016\n\006target\030\003 \001(\t\022\014\n\004v"
          + "erb\030\004 \001(\t\022\025\n\rstatus_detail\030\005 \001(\t\022\030\n\020canc"
          + "el_requested\030\006 \001(\010\022\023\n\013api_version\030\007 \001(\t\""
          + "\311\001\n\020LocationMetadata\022Y\n\017available_zones\030"
          + "\001 \003(\0132;.google.cloud.redis.v1.LocationMe"
          + "tadata.AvailableZonesEntryB\003\340A\003\032Z\n\023Avail"
          + "ableZonesEntry\022\013\n\003key\030\001 \001(\t\0222\n\005value\030\002 \001"
          + "(\0132#.google.cloud.redis.v1.ZoneMetadata:"
          + "\0028\001\"\016\n\014ZoneMetadata\"\273\001\n\016TlsCertificate\022\025"
          + "\n\rserial_number\030\001 \001(\t\022\014\n\004cert\030\002 \001(\t\0224\n\013c"
          + "reate_time\030\003 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\0224\n\013expire_time\030\004 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022\030\n\020sha1_fingerpr"
          + "int\030\005 \001(\t2\366\022\n\nCloudRedis\022\252\001\n\rListInstanc"
          + "es\022+.google.cloud.redis.v1.ListInstances"
          + "Request\032,.google.cloud.redis.v1.ListInst"
          + "ancesResponse\">\202\323\344\223\002/\022-/v1/{parent=proje"
          + "cts/*/locations/*}/instances\332A\006parent\022\227\001"
          + "\n\013GetInstance\022).google.cloud.redis.v1.Ge"
          + "tInstanceRequest\032\037.google.cloud.redis.v1"
          + ".Instance\"<\202\323\344\223\002/\022-/v1/{name=projects/*/"
          + "locations/*/instances/*}\332A\004name\022\300\001\n\025GetI"
          + "nstanceAuthString\0223.google.cloud.redis.v"
          + "1.GetInstanceAuthStringRequest\032).google."
          + "cloud.redis.v1.InstanceAuthString\"G\202\323\344\223\002"
          + ":\0228/v1/{name=projects/*/locations/*/inst"
          + "ances/*}/authString\332A\004name\022\211\002\n\016CreateIns"
          + "tance\022,.google.cloud.redis.v1.CreateInst"
          + "anceRequest\032\035.google.longrunning.Operati"
          + "on\"\251\001\202\323\344\223\0029\"-/v1/{parent=projects/*/loca"
          + "tions/*}/instances:\010instance\332A\033parent,in"
          + "stance_id,instance\312AI\n\036google.cloud.redi"
          + "s.v1.Instance\022\'google.cloud.redis.v1.Ope"
          + "rationMetadata\022\213\002\n\016UpdateInstance\022,.goog"
          + "le.cloud.redis.v1.UpdateInstanceRequest\032"
          + "\035.google.longrunning.Operation\"\253\001\202\323\344\223\002B2"
          + "6/v1/{instance.name=projects/*/locations"
          + "/*/instances/*}:\010instance\332A\024update_mask,"
          + "instance\312AI\n\036google.cloud.redis.v1.Insta"
          + "nce\022\'google.cloud.redis.v1.OperationMeta"
          + "data\022\203\002\n\017UpgradeInstance\022-.google.cloud."
          + "redis.v1.UpgradeInstanceRequest\032\035.google"
          + ".longrunning.Operation\"\241\001\202\323\344\223\002:\"5/v1/{na"
          + "me=projects/*/locations/*/instances/*}:u"
          + "pgrade:\001*\332A\022name,redis_version\312AI\n\036googl"
          + "e.cloud.redis.v1.Instance\022\'google.cloud."
          + "redis.v1.OperationMetadata\022\377\001\n\016ImportIns"
          + "tance\022,.google.cloud.redis.v1.ImportInst"
          + "anceRequest\032\035.google.longrunning.Operati"
          + "on\"\237\001\202\323\344\223\0029\"4/v1/{name=projects/*/locati"
          + "ons/*/instances/*}:import:\001*\332A\021name,inpu"
          + "t_config\312AI\n\036google.cloud.redis.v1.Insta"
          + "nce\022\'google.cloud.redis.v1.OperationMeta"
          + "data\022\200\002\n\016ExportInstance\022,.google.cloud.r"
          + "edis.v1.ExportInstanceRequest\032\035.google.l"
          + "ongrunning.Operation\"\240\001\202\323\344\223\0029\"4/v1/{name"
          + "=projects/*/locations/*/instances/*}:exp"
          + "ort:\001*\332A\022name,output_config\312AI\n\036google.c"
          + "loud.redis.v1.Instance\022\'google.cloud.red"
          + "is.v1.OperationMetadata\022\215\002\n\020FailoverInst"
          + "ance\022..google.cloud.redis.v1.FailoverIns"
          + "tanceRequest\032\035.google.longrunning.Operat"
          + "ion\"\251\001\202\323\344\223\002;\"6/v1/{name=projects/*/locat"
          + "ions/*/instances/*}:failover:\001*\332A\031name,d"
          + "ata_protection_mode\312AI\n\036google.cloud.red"
          + "is.v1.Instance\022\'google.cloud.redis.v1.Op"
          + "erationMetadata\022\336\001\n\016DeleteInstance\022,.goo"
          + "gle.cloud.redis.v1.DeleteInstanceRequest"
          + "\032\035.google.longrunning.Operation\"\177\202\323\344\223\002/*"
          + "-/v1/{name=projects/*/locations/*/instan"
          + "ces/*}\332A\004name\312A@\n\025google.protobuf.Empty\022"
          + "\'google.cloud.redis.v1.OperationMetadata"
          + "\032H\312A\024redis.googleapis.com\322A.https://www."
          + "googleapis.com/auth/cloud-platformBs\n\031co"
          + "m.google.cloud.redis.v1B\030CloudRedisServi"
          + "ceV1ProtoP\001Z:google.golang.org/genproto/"
          + "googleapis/cloud/redis/v1;redisb\006proto3"
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
              "SecondaryIpRange",
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
              "AuthEnabled",
              "ServerCaCerts",
              "TransitEncryptionMode",
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
    internal_static_google_cloud_redis_v1_GetInstanceAuthStringRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_redis_v1_GetInstanceAuthStringRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_GetInstanceAuthStringRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_redis_v1_InstanceAuthString_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_redis_v1_InstanceAuthString_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_InstanceAuthString_descriptor,
            new java.lang.String[] {
              "AuthString",
            });
    internal_static_google_cloud_redis_v1_CreateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_redis_v1_CreateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_CreateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InstanceId", "Instance",
            });
    internal_static_google_cloud_redis_v1_UpdateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_redis_v1_UpdateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_UpdateInstanceRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Instance",
            });
    internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_UpgradeInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "RedisVersion",
            });
    internal_static_google_cloud_redis_v1_DeleteInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_redis_v1_DeleteInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_DeleteInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_redis_v1_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_redis_v1_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_GcsSource_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_redis_v1_InputConfig_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_redis_v1_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_InputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "Source",
            });
    internal_static_google_cloud_redis_v1_ImportInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_redis_v1_ImportInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_ImportInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "InputConfig",
            });
    internal_static_google_cloud_redis_v1_GcsDestination_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_redis_v1_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_GcsDestination_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_redis_v1_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_redis_v1_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "Destination",
            });
    internal_static_google_cloud_redis_v1_ExportInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_redis_v1_ExportInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_ExportInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "OutputConfig",
            });
    internal_static_google_cloud_redis_v1_FailoverInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_redis_v1_FailoverInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_FailoverInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "DataProtectionMode",
            });
    internal_static_google_cloud_redis_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(18);
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
        getDescriptor().getMessageTypes().get(19);
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
        getDescriptor().getMessageTypes().get(20);
    internal_static_google_cloud_redis_v1_ZoneMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_ZoneMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_redis_v1_TlsCertificate_descriptor =
        getDescriptor().getMessageTypes().get(21);
    internal_static_google_cloud_redis_v1_TlsCertificate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_TlsCertificate_descriptor,
            new java.lang.String[] {
              "SerialNumber", "Cert", "CreateTime", "ExpireTime", "Sha1Fingerprint",
            });
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
