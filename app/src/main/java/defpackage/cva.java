package defpackage;

/* renamed from: cva  reason: default package */
/* compiled from: PG */
enum cva {
    BOOLEAN {
        /* access modifiers changed from: package-private */
        @Override // defpackage.cva
        public final int a(Object obj, Object obj2) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
    },
    STRING {
        /* access modifiers changed from: package-private */
        @Override // defpackage.cva
        public final int a(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    },
    LONG {
        /* access modifiers changed from: package-private */
        @Override // defpackage.cva
        public final int a(Object obj, Object obj2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
    },
    DOUBLE {
        /* access modifiers changed from: package-private */
        @Override // defpackage.cva
        public final int a(Object obj, Object obj2) {
            return ((Double) obj).compareTo((Double) obj2);
        }
    };

    /* access modifiers changed from: package-private */
    public abstract int a(Object obj, Object obj2);

    static cva a(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 18).append("invalid tag type: ").append(valueOf).toString());
    }
}
