package defpackage;

/* renamed from: dic reason: default package */
/* compiled from: PG */
public enum dic {
    DOUBLE(0, defpackage.did.SCALAR, defpackage.dit.DOUBLE),
    FLOAT(1, defpackage.did.SCALAR, defpackage.dit.FLOAT),
    INT64(2, defpackage.did.SCALAR, defpackage.dit.LONG),
    UINT64(3, defpackage.did.SCALAR, defpackage.dit.LONG),
    INT32(4, defpackage.did.SCALAR, defpackage.dit.INT),
    FIXED64(5, defpackage.did.SCALAR, defpackage.dit.LONG),
    FIXED32(6, defpackage.did.SCALAR, defpackage.dit.INT),
    BOOL(7, defpackage.did.SCALAR, defpackage.dit.BOOLEAN),
    STRING(8, defpackage.did.SCALAR, defpackage.dit.STRING),
    MESSAGE(9, defpackage.did.SCALAR, defpackage.dit.MESSAGE),
    BYTES(10, defpackage.did.SCALAR, defpackage.dit.BYTE_STRING),
    UINT32(11, defpackage.did.SCALAR, defpackage.dit.INT),
    ENUM(12, defpackage.did.SCALAR, defpackage.dit.ENUM),
    SFIXED32(13, defpackage.did.SCALAR, defpackage.dit.INT),
    SFIXED64(14, defpackage.did.SCALAR, defpackage.dit.LONG),
    SINT32(15, defpackage.did.SCALAR, defpackage.dit.INT),
    SINT64(16, defpackage.did.SCALAR, defpackage.dit.LONG),
    GROUP(17, defpackage.did.SCALAR, defpackage.dit.MESSAGE),
    DOUBLE_LIST(18, defpackage.did.VECTOR, defpackage.dit.DOUBLE),
    FLOAT_LIST(19, defpackage.did.VECTOR, defpackage.dit.FLOAT),
    INT64_LIST(20, defpackage.did.VECTOR, defpackage.dit.LONG),
    UINT64_LIST(21, defpackage.did.VECTOR, defpackage.dit.LONG),
    INT32_LIST(22, defpackage.did.VECTOR, defpackage.dit.INT),
    FIXED64_LIST(23, defpackage.did.VECTOR, defpackage.dit.LONG),
    FIXED32_LIST(24, defpackage.did.VECTOR, defpackage.dit.INT),
    BOOL_LIST(25, defpackage.did.VECTOR, defpackage.dit.BOOLEAN),
    STRING_LIST(26, defpackage.did.VECTOR, defpackage.dit.STRING),
    MESSAGE_LIST(27, defpackage.did.VECTOR, defpackage.dit.MESSAGE),
    BYTES_LIST(28, defpackage.did.VECTOR, defpackage.dit.BYTE_STRING),
    UINT32_LIST(29, defpackage.did.VECTOR, defpackage.dit.INT),
    ENUM_LIST(30, defpackage.did.VECTOR, defpackage.dit.ENUM),
    SFIXED32_LIST(31, defpackage.did.VECTOR, defpackage.dit.INT),
    SFIXED64_LIST(32, defpackage.did.VECTOR, defpackage.dit.LONG),
    SINT32_LIST(33, defpackage.did.VECTOR, defpackage.dit.INT),
    SINT64_LIST(34, defpackage.did.VECTOR, defpackage.dit.LONG),
    DOUBLE_LIST_PACKED(35, defpackage.did.PACKED_VECTOR, defpackage.dit.DOUBLE),
    FLOAT_LIST_PACKED(36, defpackage.did.PACKED_VECTOR, defpackage.dit.FLOAT),
    INT64_LIST_PACKED(37, defpackage.did.PACKED_VECTOR, defpackage.dit.LONG),
    UINT64_LIST_PACKED(38, defpackage.did.PACKED_VECTOR, defpackage.dit.LONG),
    INT32_LIST_PACKED(39, defpackage.did.PACKED_VECTOR, defpackage.dit.INT),
    FIXED64_LIST_PACKED(40, defpackage.did.PACKED_VECTOR, defpackage.dit.LONG),
    FIXED32_LIST_PACKED(41, defpackage.did.PACKED_VECTOR, defpackage.dit.INT),
    BOOL_LIST_PACKED(42, defpackage.did.PACKED_VECTOR, defpackage.dit.BOOLEAN),
    UINT32_LIST_PACKED(43, defpackage.did.PACKED_VECTOR, defpackage.dit.INT),
    ENUM_LIST_PACKED(44, defpackage.did.PACKED_VECTOR, defpackage.dit.ENUM),
    SFIXED32_LIST_PACKED(45, defpackage.did.PACKED_VECTOR, defpackage.dit.INT),
    SFIXED64_LIST_PACKED(46, defpackage.did.PACKED_VECTOR, defpackage.dit.LONG),
    SINT32_LIST_PACKED(47, defpackage.did.PACKED_VECTOR, defpackage.dit.INT),
    SINT64_LIST_PACKED(48, defpackage.did.PACKED_VECTOR, defpackage.dit.LONG),
    GROUP_LIST(49, defpackage.did.VECTOR, defpackage.dit.MESSAGE),
    MAP(50, defpackage.did.MAP, defpackage.dit.VOID);
    
    private static final defpackage.dic[] aa = null;
    public final int k;

    private dic(int i, defpackage.did did, defpackage.dit dit) {
        this.k = i;
        switch (did.ordinal()) {
            case 1:
                java.lang.Class cls = dit.k;
                break;
            case 3:
                java.lang.Class cls2 = dit.k;
                break;
        }
        if (did == defpackage.did.SCALAR) {
            dit.ordinal();
        }
    }

    static {
        int i;
        defpackage.dic[] values = values();
        aa = new defpackage.dic[values.length];
        for (defpackage.dic dic : values) {
            aa[dic.k] = dic;
        }
    }
}
