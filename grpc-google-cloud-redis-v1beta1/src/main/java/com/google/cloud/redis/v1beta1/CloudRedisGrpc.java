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
package com.google.cloud.redis.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/redis/v1beta1/cloud_redis.proto")
public final class CloudRedisGrpc {

  private CloudRedisGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.redis.v1beta1.CloudRedis";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.ListInstancesRequest,
          com.google.cloud.redis.v1beta1.ListInstancesResponse>
      getListInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstances",
      requestType = com.google.cloud.redis.v1beta1.ListInstancesRequest.class,
      responseType = com.google.cloud.redis.v1beta1.ListInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.ListInstancesRequest,
          com.google.cloud.redis.v1beta1.ListInstancesResponse>
      getListInstancesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.redis.v1beta1.ListInstancesRequest,
            com.google.cloud.redis.v1beta1.ListInstancesResponse>
        getListInstancesMethod;
    if ((getListInstancesMethod = CloudRedisGrpc.getListInstancesMethod) == null) {
      synchronized (CloudRedisGrpc.class) {
        if ((getListInstancesMethod = CloudRedisGrpc.getListInstancesMethod) == null) {
          CloudRedisGrpc.getListInstancesMethod =
              getListInstancesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.redis.v1beta1.ListInstancesRequest,
                          com.google.cloud.redis.v1beta1.ListInstancesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInstances"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.redis.v1beta1.ListInstancesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.redis.v1beta1.ListInstancesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new CloudRedisMethodDescriptorSupplier("ListInstances"))
                      .build();
        }
      }
    }
    return getListInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.GetInstanceRequest,
          com.google.cloud.redis.v1beta1.Instance>
      getGetInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInstance",
      requestType = com.google.cloud.redis.v1beta1.GetInstanceRequest.class,
      responseType = com.google.cloud.redis.v1beta1.Instance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.GetInstanceRequest,
          com.google.cloud.redis.v1beta1.Instance>
      getGetInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.redis.v1beta1.GetInstanceRequest,
            com.google.cloud.redis.v1beta1.Instance>
        getGetInstanceMethod;
    if ((getGetInstanceMethod = CloudRedisGrpc.getGetInstanceMethod) == null) {
      synchronized (CloudRedisGrpc.class) {
        if ((getGetInstanceMethod = CloudRedisGrpc.getGetInstanceMethod) == null) {
          CloudRedisGrpc.getGetInstanceMethod =
              getGetInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.redis.v1beta1.GetInstanceRequest,
                          com.google.cloud.redis.v1beta1.Instance>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.redis.v1beta1.GetInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.redis.v1beta1.Instance.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudRedisMethodDescriptorSupplier("GetInstance"))
                      .build();
        }
      }
    }
    return getGetInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.CreateInstanceRequest, com.google.longrunning.Operation>
      getCreateInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInstance",
      requestType = com.google.cloud.redis.v1beta1.CreateInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.CreateInstanceRequest, com.google.longrunning.Operation>
      getCreateInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.redis.v1beta1.CreateInstanceRequest, com.google.longrunning.Operation>
        getCreateInstanceMethod;
    if ((getCreateInstanceMethod = CloudRedisGrpc.getCreateInstanceMethod) == null) {
      synchronized (CloudRedisGrpc.class) {
        if ((getCreateInstanceMethod = CloudRedisGrpc.getCreateInstanceMethod) == null) {
          CloudRedisGrpc.getCreateInstanceMethod =
              getCreateInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.redis.v1beta1.CreateInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.redis.v1beta1.CreateInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudRedisMethodDescriptorSupplier("CreateInstance"))
                      .build();
        }
      }
    }
    return getCreateInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.UpdateInstanceRequest, com.google.longrunning.Operation>
      getUpdateInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInstance",
      requestType = com.google.cloud.redis.v1beta1.UpdateInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.UpdateInstanceRequest, com.google.longrunning.Operation>
      getUpdateInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.redis.v1beta1.UpdateInstanceRequest, com.google.longrunning.Operation>
        getUpdateInstanceMethod;
    if ((getUpdateInstanceMethod = CloudRedisGrpc.getUpdateInstanceMethod) == null) {
      synchronized (CloudRedisGrpc.class) {
        if ((getUpdateInstanceMethod = CloudRedisGrpc.getUpdateInstanceMethod) == null) {
          CloudRedisGrpc.getUpdateInstanceMethod =
              getUpdateInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.redis.v1beta1.UpdateInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.redis.v1beta1.UpdateInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudRedisMethodDescriptorSupplier("UpdateInstance"))
                      .build();
        }
      }
    }
    return getUpdateInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.UpgradeInstanceRequest, com.google.longrunning.Operation>
      getUpgradeInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpgradeInstance",
      requestType = com.google.cloud.redis.v1beta1.UpgradeInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.UpgradeInstanceRequest, com.google.longrunning.Operation>
      getUpgradeInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.redis.v1beta1.UpgradeInstanceRequest, com.google.longrunning.Operation>
        getUpgradeInstanceMethod;
    if ((getUpgradeInstanceMethod = CloudRedisGrpc.getUpgradeInstanceMethod) == null) {
      synchronized (CloudRedisGrpc.class) {
        if ((getUpgradeInstanceMethod = CloudRedisGrpc.getUpgradeInstanceMethod) == null) {
          CloudRedisGrpc.getUpgradeInstanceMethod =
              getUpgradeInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.redis.v1beta1.UpgradeInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpgradeInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.redis.v1beta1.UpgradeInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudRedisMethodDescriptorSupplier("UpgradeInstance"))
                      .build();
        }
      }
    }
    return getUpgradeInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.ImportInstanceRequest, com.google.longrunning.Operation>
      getImportInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportInstance",
      requestType = com.google.cloud.redis.v1beta1.ImportInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.ImportInstanceRequest, com.google.longrunning.Operation>
      getImportInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.redis.v1beta1.ImportInstanceRequest, com.google.longrunning.Operation>
        getImportInstanceMethod;
    if ((getImportInstanceMethod = CloudRedisGrpc.getImportInstanceMethod) == null) {
      synchronized (CloudRedisGrpc.class) {
        if ((getImportInstanceMethod = CloudRedisGrpc.getImportInstanceMethod) == null) {
          CloudRedisGrpc.getImportInstanceMethod =
              getImportInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.redis.v1beta1.ImportInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.redis.v1beta1.ImportInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudRedisMethodDescriptorSupplier("ImportInstance"))
                      .build();
        }
      }
    }
    return getImportInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.ExportInstanceRequest, com.google.longrunning.Operation>
      getExportInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportInstance",
      requestType = com.google.cloud.redis.v1beta1.ExportInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.ExportInstanceRequest, com.google.longrunning.Operation>
      getExportInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.redis.v1beta1.ExportInstanceRequest, com.google.longrunning.Operation>
        getExportInstanceMethod;
    if ((getExportInstanceMethod = CloudRedisGrpc.getExportInstanceMethod) == null) {
      synchronized (CloudRedisGrpc.class) {
        if ((getExportInstanceMethod = CloudRedisGrpc.getExportInstanceMethod) == null) {
          CloudRedisGrpc.getExportInstanceMethod =
              getExportInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.redis.v1beta1.ExportInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.redis.v1beta1.ExportInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudRedisMethodDescriptorSupplier("ExportInstance"))
                      .build();
        }
      }
    }
    return getExportInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.FailoverInstanceRequest, com.google.longrunning.Operation>
      getFailoverInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FailoverInstance",
      requestType = com.google.cloud.redis.v1beta1.FailoverInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.FailoverInstanceRequest, com.google.longrunning.Operation>
      getFailoverInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.redis.v1beta1.FailoverInstanceRequest,
            com.google.longrunning.Operation>
        getFailoverInstanceMethod;
    if ((getFailoverInstanceMethod = CloudRedisGrpc.getFailoverInstanceMethod) == null) {
      synchronized (CloudRedisGrpc.class) {
        if ((getFailoverInstanceMethod = CloudRedisGrpc.getFailoverInstanceMethod) == null) {
          CloudRedisGrpc.getFailoverInstanceMethod =
              getFailoverInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.redis.v1beta1.FailoverInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FailoverInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.redis.v1beta1.FailoverInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudRedisMethodDescriptorSupplier("FailoverInstance"))
                      .build();
        }
      }
    }
    return getFailoverInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.DeleteInstanceRequest, com.google.longrunning.Operation>
      getDeleteInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInstance",
      requestType = com.google.cloud.redis.v1beta1.DeleteInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.redis.v1beta1.DeleteInstanceRequest, com.google.longrunning.Operation>
      getDeleteInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.redis.v1beta1.DeleteInstanceRequest, com.google.longrunning.Operation>
        getDeleteInstanceMethod;
    if ((getDeleteInstanceMethod = CloudRedisGrpc.getDeleteInstanceMethod) == null) {
      synchronized (CloudRedisGrpc.class) {
        if ((getDeleteInstanceMethod = CloudRedisGrpc.getDeleteInstanceMethod) == null) {
          CloudRedisGrpc.getDeleteInstanceMethod =
              getDeleteInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.redis.v1beta1.DeleteInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.redis.v1beta1.DeleteInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudRedisMethodDescriptorSupplier("DeleteInstance"))
                      .build();
        }
      }
    }
    return getDeleteInstanceMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static CloudRedisStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudRedisStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudRedisStub>() {
          @java.lang.Override
          public CloudRedisStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudRedisStub(channel, callOptions);
          }
        };
    return CloudRedisStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudRedisBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudRedisBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudRedisBlockingStub>() {
          @java.lang.Override
          public CloudRedisBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudRedisBlockingStub(channel, callOptions);
          }
        };
    return CloudRedisBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static CloudRedisFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudRedisFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudRedisFutureStub>() {
          @java.lang.Override
          public CloudRedisFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudRedisFutureStub(channel, callOptions);
          }
        };
    return CloudRedisFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class CloudRedisImplBase implements io.grpc.BindableService {

    /** */
    public void listInstances(
        com.google.cloud.redis.v1beta1.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.redis.v1beta1.ListInstancesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListInstancesMethod(), responseObserver);
    }

    /** */
    public void getInstance(
        com.google.cloud.redis.v1beta1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.redis.v1beta1.Instance> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInstanceMethod(), responseObserver);
    }

    /** */
    public void createInstance(
        com.google.cloud.redis.v1beta1.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateInstanceMethod(), responseObserver);
    }

    /** */
    public void updateInstance(
        com.google.cloud.redis.v1beta1.UpdateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateInstanceMethod(), responseObserver);
    }

    /** */
    public void upgradeInstance(
        com.google.cloud.redis.v1beta1.UpgradeInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpgradeInstanceMethod(), responseObserver);
    }

    /** */
    public void importInstance(
        com.google.cloud.redis.v1beta1.ImportInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getImportInstanceMethod(), responseObserver);
    }

    /** */
    public void exportInstance(
        com.google.cloud.redis.v1beta1.ExportInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getExportInstanceMethod(), responseObserver);
    }

    /** */
    public void failoverInstance(
        com.google.cloud.redis.v1beta1.FailoverInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getFailoverInstanceMethod(), responseObserver);
    }

    /** */
    public void deleteInstance(
        com.google.cloud.redis.v1beta1.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInstanceMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListInstancesMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.redis.v1beta1.ListInstancesRequest,
                      com.google.cloud.redis.v1beta1.ListInstancesResponse>(
                      this, METHODID_LIST_INSTANCES)))
          .addMethod(
              getGetInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.redis.v1beta1.GetInstanceRequest,
                      com.google.cloud.redis.v1beta1.Instance>(this, METHODID_GET_INSTANCE)))
          .addMethod(
              getCreateInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.redis.v1beta1.CreateInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_CREATE_INSTANCE)))
          .addMethod(
              getUpdateInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.redis.v1beta1.UpdateInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_UPDATE_INSTANCE)))
          .addMethod(
              getUpgradeInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.redis.v1beta1.UpgradeInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_UPGRADE_INSTANCE)))
          .addMethod(
              getImportInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.redis.v1beta1.ImportInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_IMPORT_INSTANCE)))
          .addMethod(
              getExportInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.redis.v1beta1.ExportInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_EXPORT_INSTANCE)))
          .addMethod(
              getFailoverInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.redis.v1beta1.FailoverInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_FAILOVER_INSTANCE)))
          .addMethod(
              getDeleteInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.redis.v1beta1.DeleteInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_DELETE_INSTANCE)))
          .build();
    }
  }

  /** */
  public static final class CloudRedisStub extends io.grpc.stub.AbstractAsyncStub<CloudRedisStub> {
    private CloudRedisStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudRedisStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudRedisStub(channel, callOptions);
    }

    /** */
    public void listInstances(
        com.google.cloud.redis.v1beta1.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.redis.v1beta1.ListInstancesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getInstance(
        com.google.cloud.redis.v1beta1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.redis.v1beta1.Instance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createInstance(
        com.google.cloud.redis.v1beta1.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateInstance(
        com.google.cloud.redis.v1beta1.UpdateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void upgradeInstance(
        com.google.cloud.redis.v1beta1.UpgradeInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpgradeInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void importInstance(
        com.google.cloud.redis.v1beta1.ImportInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void exportInstance(
        com.google.cloud.redis.v1beta1.ExportInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void failoverInstance(
        com.google.cloud.redis.v1beta1.FailoverInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFailoverInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteInstance(
        com.google.cloud.redis.v1beta1.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class CloudRedisBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CloudRedisBlockingStub> {
    private CloudRedisBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudRedisBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudRedisBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.redis.v1beta1.ListInstancesResponse listInstances(
        com.google.cloud.redis.v1beta1.ListInstancesRequest request) {
      return blockingUnaryCall(getChannel(), getListInstancesMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.redis.v1beta1.Instance getInstance(
        com.google.cloud.redis.v1beta1.GetInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getGetInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation createInstance(
        com.google.cloud.redis.v1beta1.CreateInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getCreateInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation updateInstance(
        com.google.cloud.redis.v1beta1.UpdateInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation upgradeInstance(
        com.google.cloud.redis.v1beta1.UpgradeInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getUpgradeInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation importInstance(
        com.google.cloud.redis.v1beta1.ImportInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getImportInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation exportInstance(
        com.google.cloud.redis.v1beta1.ExportInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getExportInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation failoverInstance(
        com.google.cloud.redis.v1beta1.FailoverInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getFailoverInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation deleteInstance(
        com.google.cloud.redis.v1beta1.DeleteInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteInstanceMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class CloudRedisFutureStub
      extends io.grpc.stub.AbstractFutureStub<CloudRedisFutureStub> {
    private CloudRedisFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudRedisFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudRedisFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.redis.v1beta1.ListInstancesResponse>
        listInstances(com.google.cloud.redis.v1beta1.ListInstancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.redis.v1beta1.Instance>
        getInstance(com.google.cloud.redis.v1beta1.GetInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createInstance(com.google.cloud.redis.v1beta1.CreateInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        updateInstance(com.google.cloud.redis.v1beta1.UpdateInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        upgradeInstance(com.google.cloud.redis.v1beta1.UpgradeInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpgradeInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        importInstance(com.google.cloud.redis.v1beta1.ImportInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getImportInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        exportInstance(com.google.cloud.redis.v1beta1.ExportInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExportInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        failoverInstance(com.google.cloud.redis.v1beta1.FailoverInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFailoverInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteInstance(com.google.cloud.redis.v1beta1.DeleteInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInstanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INSTANCES = 0;
  private static final int METHODID_GET_INSTANCE = 1;
  private static final int METHODID_CREATE_INSTANCE = 2;
  private static final int METHODID_UPDATE_INSTANCE = 3;
  private static final int METHODID_UPGRADE_INSTANCE = 4;
  private static final int METHODID_IMPORT_INSTANCE = 5;
  private static final int METHODID_EXPORT_INSTANCE = 6;
  private static final int METHODID_FAILOVER_INSTANCE = 7;
  private static final int METHODID_DELETE_INSTANCE = 8;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CloudRedisImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CloudRedisImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances(
              (com.google.cloud.redis.v1beta1.ListInstancesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.redis.v1beta1.ListInstancesResponse>)
                  responseObserver);
          break;
        case METHODID_GET_INSTANCE:
          serviceImpl.getInstance(
              (com.google.cloud.redis.v1beta1.GetInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.redis.v1beta1.Instance>)
                  responseObserver);
          break;
        case METHODID_CREATE_INSTANCE:
          serviceImpl.createInstance(
              (com.google.cloud.redis.v1beta1.CreateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_INSTANCE:
          serviceImpl.updateInstance(
              (com.google.cloud.redis.v1beta1.UpdateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPGRADE_INSTANCE:
          serviceImpl.upgradeInstance(
              (com.google.cloud.redis.v1beta1.UpgradeInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_IMPORT_INSTANCE:
          serviceImpl.importInstance(
              (com.google.cloud.redis.v1beta1.ImportInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_INSTANCE:
          serviceImpl.exportInstance(
              (com.google.cloud.redis.v1beta1.ExportInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_FAILOVER_INSTANCE:
          serviceImpl.failoverInstance(
              (com.google.cloud.redis.v1beta1.FailoverInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_INSTANCE:
          serviceImpl.deleteInstance(
              (com.google.cloud.redis.v1beta1.DeleteInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class CloudRedisBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CloudRedisBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CloudRedis");
    }
  }

  private static final class CloudRedisFileDescriptorSupplier
      extends CloudRedisBaseDescriptorSupplier {
    CloudRedisFileDescriptorSupplier() {}
  }

  private static final class CloudRedisMethodDescriptorSupplier
      extends CloudRedisBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CloudRedisMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CloudRedisGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new CloudRedisFileDescriptorSupplier())
                      .addMethod(getListInstancesMethod())
                      .addMethod(getGetInstanceMethod())
                      .addMethod(getCreateInstanceMethod())
                      .addMethod(getUpdateInstanceMethod())
                      .addMethod(getUpgradeInstanceMethod())
                      .addMethod(getImportInstanceMethod())
                      .addMethod(getExportInstanceMethod())
                      .addMethod(getFailoverInstanceMethod())
                      .addMethod(getDeleteInstanceMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
