// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fizbuz.proto

package my.rpc;

/**
 * Protobuf type {@code my.rpc.FizBuzAnswer}
 */
public  final class FizBuzAnswer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:my.rpc.FizBuzAnswer)
    FizBuzAnswerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FizBuzAnswer.newBuilder() to construct.
  private FizBuzAnswer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FizBuzAnswer() {
    answer_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FizBuzAnswer(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            answer_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return my.rpc.Fizbuz.internal_static_my_rpc_FizBuzAnswer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return my.rpc.Fizbuz.internal_static_my_rpc_FizBuzAnswer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            my.rpc.FizBuzAnswer.class, my.rpc.FizBuzAnswer.Builder.class);
  }

  public static final int ANSWER_FIELD_NUMBER = 1;
  private volatile java.lang.Object answer_;
  /**
   * <code>string answer = 1;</code>
   */
  public java.lang.String getAnswer() {
    java.lang.Object ref = answer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      answer_ = s;
      return s;
    }
  }
  /**
   * <code>string answer = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAnswerBytes() {
    java.lang.Object ref = answer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      answer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAnswerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, answer_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAnswerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, answer_);
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
    if (!(obj instanceof my.rpc.FizBuzAnswer)) {
      return super.equals(obj);
    }
    my.rpc.FizBuzAnswer other = (my.rpc.FizBuzAnswer) obj;

    boolean result = true;
    result = result && getAnswer()
        .equals(other.getAnswer());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ANSWER_FIELD_NUMBER;
    hash = (53 * hash) + getAnswer().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static my.rpc.FizBuzAnswer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static my.rpc.FizBuzAnswer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static my.rpc.FizBuzAnswer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static my.rpc.FizBuzAnswer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static my.rpc.FizBuzAnswer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static my.rpc.FizBuzAnswer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static my.rpc.FizBuzAnswer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static my.rpc.FizBuzAnswer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static my.rpc.FizBuzAnswer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static my.rpc.FizBuzAnswer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static my.rpc.FizBuzAnswer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static my.rpc.FizBuzAnswer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(my.rpc.FizBuzAnswer prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code my.rpc.FizBuzAnswer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:my.rpc.FizBuzAnswer)
      my.rpc.FizBuzAnswerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return my.rpc.Fizbuz.internal_static_my_rpc_FizBuzAnswer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return my.rpc.Fizbuz.internal_static_my_rpc_FizBuzAnswer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              my.rpc.FizBuzAnswer.class, my.rpc.FizBuzAnswer.Builder.class);
    }

    // Construct using my.rpc.FizBuzAnswer.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      answer_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return my.rpc.Fizbuz.internal_static_my_rpc_FizBuzAnswer_descriptor;
    }

    @java.lang.Override
    public my.rpc.FizBuzAnswer getDefaultInstanceForType() {
      return my.rpc.FizBuzAnswer.getDefaultInstance();
    }

    @java.lang.Override
    public my.rpc.FizBuzAnswer build() {
      my.rpc.FizBuzAnswer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public my.rpc.FizBuzAnswer buildPartial() {
      my.rpc.FizBuzAnswer result = new my.rpc.FizBuzAnswer(this);
      result.answer_ = answer_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof my.rpc.FizBuzAnswer) {
        return mergeFrom((my.rpc.FizBuzAnswer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(my.rpc.FizBuzAnswer other) {
      if (other == my.rpc.FizBuzAnswer.getDefaultInstance()) return this;
      if (!other.getAnswer().isEmpty()) {
        answer_ = other.answer_;
        onChanged();
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
      my.rpc.FizBuzAnswer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (my.rpc.FizBuzAnswer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object answer_ = "";
    /**
     * <code>string answer = 1;</code>
     */
    public java.lang.String getAnswer() {
      java.lang.Object ref = answer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        answer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string answer = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAnswerBytes() {
      java.lang.Object ref = answer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        answer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string answer = 1;</code>
     */
    public Builder setAnswer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      answer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string answer = 1;</code>
     */
    public Builder clearAnswer() {
      
      answer_ = getDefaultInstance().getAnswer();
      onChanged();
      return this;
    }
    /**
     * <code>string answer = 1;</code>
     */
    public Builder setAnswerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      answer_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:my.rpc.FizBuzAnswer)
  }

  // @@protoc_insertion_point(class_scope:my.rpc.FizBuzAnswer)
  private static final my.rpc.FizBuzAnswer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new my.rpc.FizBuzAnswer();
  }

  public static my.rpc.FizBuzAnswer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FizBuzAnswer>
      PARSER = new com.google.protobuf.AbstractParser<FizBuzAnswer>() {
    @java.lang.Override
    public FizBuzAnswer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FizBuzAnswer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FizBuzAnswer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FizBuzAnswer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public my.rpc.FizBuzAnswer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

