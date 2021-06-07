package defpackage;

/* renamed from: dic  reason: default package */
/* compiled from: PG */
public enum dic {
    DOUBLE(0, did.SCALAR, dit.DOUBLE),
    FLOAT(1, did.SCALAR, dit.FLOAT),
    INT64(2, did.SCALAR, dit.LONG),
    UINT64(3, did.SCALAR, dit.LONG),
    INT32(4, did.SCALAR, dit.INT),
    FIXED64(5, did.SCALAR, dit.LONG),
    FIXED32(6, did.SCALAR, dit.INT),
    BOOL(7, did.SCALAR, dit.BOOLEAN),
    STRING(8, did.SCALAR, dit.STRING),
    MESSAGE(9, did.SCALAR, dit.MESSAGE),
    BYTES(10, did.SCALAR, dit.BYTE_STRING),
    UINT32(11, did.SCALAR, dit.INT),
    ENUM(12, did.SCALAR, dit.ENUM),
    SFIXED32(13, did.SCALAR, dit.INT),
    SFIXED64(14, did.SCALAR, dit.LONG),
    SINT32(15, did.SCALAR, dit.INT),
    SINT64(16, did.SCALAR, dit.LONG),
    GROUP(17, did.SCALAR, dit.MESSAGE),
    DOUBLE_LIST(18, did.VECTOR, dit.DOUBLE),
    FLOAT_LIST(19, did.VECTOR, dit.FLOAT),
    INT64_LIST(20, did.VECTOR, dit.LONG),
    UINT64_LIST(21, did.VECTOR, dit.LONG),
    INT32_LIST(22, did.VECTOR, dit.INT),
    FIXED64_LIST(23, did.VECTOR, dit.LONG),
    FIXED32_LIST(24, did.VECTOR, dit.INT),
    BOOL_LIST(25, did.VECTOR, dit.BOOLEAN),
    STRING_LIST(26, did.VECTOR, dit.STRING),
    MESSAGE_LIST(27, did.VECTOR, dit.MESSAGE),
    BYTES_LIST(28, did.VECTOR, dit.BYTE_STRING),
    UINT32_LIST(29, did.VECTOR, dit.INT),
    ENUM_LIST(30, did.VECTOR, dit.ENUM),
    SFIXED32_LIST(31, did.VECTOR, dit.INT),
    SFIXED64_LIST(32, did.VECTOR, dit.LONG),
    SINT32_LIST(33, did.VECTOR, dit.INT),
    SINT64_LIST(34, did.VECTOR, dit.LONG),
    DOUBLE_LIST_PACKED(35, did.PACKED_VECTOR, dit.DOUBLE),
    FLOAT_LIST_PACKED(36, did.PACKED_VECTOR, dit.FLOAT),
    INT64_LIST_PACKED(37, did.PACKED_VECTOR, dit.LONG),
    UINT64_LIST_PACKED(38, did.PACKED_VECTOR, dit.LONG),
    INT32_LIST_PACKED(39, did.PACKED_VECTOR, dit.INT),
    FIXED64_LIST_PACKED(40, did.PACKED_VECTOR, dit.LONG),
    FIXED32_LIST_PACKED(41, did.PACKED_VECTOR, dit.INT),
    BOOL_LIST_PACKED(42, did.PACKED_VECTOR, dit.BOOLEAN),
    UINT32_LIST_PACKED(43, did.PACKED_VECTOR, dit.INT),
    ENUM_LIST_PACKED(44, did.PACKED_VECTOR, dit.ENUM),
    SFIXED32_LIST_PACKED(45, did.PACKED_VECTOR, dit.INT),
    SFIXED64_LIST_PACKED(46, did.PACKED_VECTOR, dit.LONG),
    SINT32_LIST_PACKED(47, did.PACKED_VECTOR, dit.INT),
    SINT64_LIST_PACKED(48, did.PACKED_VECTOR, dit.LONG),
    GROUP_LIST(49, did.VECTOR, dit.MESSAGE),
    MAP(50, did.MAP, dit.VOID);
    
    private static final dic[] aa;
    public final int k;

    private dic(int i, did did, dit dit) {
        this.k = i;
        switch (did.ordinal()) {
            case 1:
                Class cls = dit.k;
                break;
            case 3:
                Class cls2 = dit.k;
                break;
        }
        if (did == did.SCALAR) {
            dit.ordinal();
        }
    }

    static {
        dic[] values = values();
        aa = new dic[values.length];
        for (dic dic : values) {
            aa[dic.k] = dic;
        }
    }
}
