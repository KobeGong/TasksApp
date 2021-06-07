package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: cug  reason: default package */
/* compiled from: PG */
public enum cug {
    GENERAL {
        @Override // defpackage.cug
        public final boolean a(Object obj) {
            return true;
        }
    },
    BOOLEAN {
        @Override // defpackage.cug
        public final boolean a(Object obj) {
            return obj instanceof Boolean;
        }
    },
    CHARACTER {
        @Override // defpackage.cug
        public final boolean a(Object obj) {
            if (obj instanceof Character) {
                return true;
            }
            if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                return Character.isValidCodePoint(((Number) obj).intValue());
            }
            return false;
        }
    },
    INTEGRAL {
        @Override // defpackage.cug
        public final boolean a(Object obj) {
            return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger);
        }
    },
    FLOAT {
        @Override // defpackage.cug
        public final boolean a(Object obj) {
            return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
        }
    };
    
    public final boolean f;

    public abstract boolean a(Object obj);

    cug(boolean z) {
        this.f = z;
    }
}
