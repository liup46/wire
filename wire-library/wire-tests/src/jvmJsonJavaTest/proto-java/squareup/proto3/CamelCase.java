// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto3.CamelCase in camel_case.proto
package squareup.proto3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class CamelCase extends Message<CamelCase, CamelCase.Builder> {
  public static final ProtoAdapter<CamelCase> ADAPTER = ProtoAdapter.newMessageAdapter(CamelCase.class, "type.googleapis.com/squareup.proto3.CamelCase", Syntax.PROTO_3);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_IDITIT_MY_WAY = "";

  @WireField(
      tag = 1,
      adapter = "squareup.proto3.CamelCase$NestedCamelCase#ADAPTER",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "nestedMessage"
  )
  public final NestedCamelCase nested__message;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.PACKED,
      jsonName = "RepInt32"
  )
  public final List<Integer> _Rep_int32;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "iDitItMyWAy"
  )
  public final String IDitIt_my_wAy;

  @WireField(
      tag = 4,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      jsonName = "mapInt32Int32"
  )
  public final Map<Integer, Integer> map_int32_Int32;

  public CamelCase(NestedCamelCase nested__message, List<Integer> _Rep_int32, String IDitIt_my_wAy,
      Map<Integer, Integer> map_int32_Int32) {
    this(nested__message, _Rep_int32, IDitIt_my_wAy, map_int32_Int32, ByteString.EMPTY);
  }

  public CamelCase(NestedCamelCase nested__message, List<Integer> _Rep_int32, String IDitIt_my_wAy,
      Map<Integer, Integer> map_int32_Int32, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.nested__message = nested__message;
    this._Rep_int32 = Internal.immutableCopyOf("_Rep_int32", _Rep_int32);
    this.IDitIt_my_wAy = IDitIt_my_wAy;
    this.map_int32_Int32 = Internal.immutableCopyOf("map_int32_Int32", map_int32_Int32);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.nested__message = nested__message;
    builder._Rep_int32 = Internal.copyOf(_Rep_int32);
    builder.IDitIt_my_wAy = IDitIt_my_wAy;
    builder.map_int32_Int32 = Internal.copyOf(map_int32_Int32);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CamelCase)) return false;
    CamelCase o = (CamelCase) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(nested__message, o.nested__message)
        && _Rep_int32.equals(o._Rep_int32)
        && Internal.equals(IDitIt_my_wAy, o.IDitIt_my_wAy)
        && map_int32_Int32.equals(o.map_int32_Int32);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (nested__message != null ? nested__message.hashCode() : 0);
      result = result * 37 + _Rep_int32.hashCode();
      result = result * 37 + (IDitIt_my_wAy != null ? IDitIt_my_wAy.hashCode() : 0);
      result = result * 37 + map_int32_Int32.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<CamelCase, Builder> {
    public NestedCamelCase nested__message;

    public List<Integer> _Rep_int32;

    public String IDitIt_my_wAy;

    public Map<Integer, Integer> map_int32_Int32;

    public Builder() {
      _Rep_int32 = Internal.newMutableList();
      map_int32_Int32 = Internal.newMutableMap();
    }

    public Builder nested__message(NestedCamelCase nested__message) {
      this.nested__message = nested__message;
      return this;
    }

    public Builder _Rep_int32(List<Integer> _Rep_int32) {
      Internal.checkElementsNotNull(_Rep_int32);
      this._Rep_int32 = _Rep_int32;
      return this;
    }

    public Builder IDitIt_my_wAy(String IDitIt_my_wAy) {
      this.IDitIt_my_wAy = IDitIt_my_wAy;
      return this;
    }

    public Builder map_int32_Int32(Map<Integer, Integer> map_int32_Int32) {
      Internal.checkElementsNotNull(map_int32_Int32);
      this.map_int32_Int32 = map_int32_Int32;
      return this;
    }

    @Override
    public CamelCase build() {
      return new CamelCase(nested__message, _Rep_int32, IDitIt_my_wAy, map_int32_Int32, super.buildUnknownFields());
    }
  }

  public static final class NestedCamelCase extends Message<NestedCamelCase, NestedCamelCase.Builder> {
    public static final ProtoAdapter<NestedCamelCase> ADAPTER = ProtoAdapter.newMessageAdapter(NestedCamelCase.class, "type.googleapis.com/squareup.proto3.CamelCase.NestedCamelCase", Syntax.PROTO_3);

    private static final long serialVersionUID = 0L;

    public static final Integer DEFAULT_ONE_INT32 = 0;

    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#INT32",
        label = WireField.Label.OMIT_IDENTITY,
        jsonName = "oneInt32"
    )
    public final Integer one_int32;

    public NestedCamelCase(Integer one_int32) {
      this(one_int32, ByteString.EMPTY);
    }

    public NestedCamelCase(Integer one_int32, ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.one_int32 = one_int32;
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.one_int32 = one_int32;
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof NestedCamelCase)) return false;
      NestedCamelCase o = (NestedCamelCase) other;
      return unknownFields().equals(o.unknownFields())
          && Internal.equals(one_int32, o.one_int32);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (one_int32 != null ? one_int32.hashCode() : 0);
        super.hashCode = result;
      }
      return result;
    }

    public static final class Builder extends Message.Builder<NestedCamelCase, Builder> {
      public Integer one_int32;

      public Builder() {
      }

      public Builder one_int32(Integer one_int32) {
        this.one_int32 = one_int32;
        return this;
      }

      @Override
      public NestedCamelCase build() {
        return new NestedCamelCase(one_int32, super.buildUnknownFields());
      }
    }
  }
}
