package defpackage;

import java.util.Arrays;

/* renamed from: buj  reason: default package */
/* compiled from: PG */
final class buj extends bus {
    private final Long a;
    private final Integer b;
    private final byte[] c;

    buj(Long l, Integer num, byte[] bArr) {
        this.a = l;
        this.b = num;
        this.c = bArr;
    }

    @Override // defpackage.bus
    public final Long a() {
        return this.a;
    }

    @Override // defpackage.bus
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.bus
    public final byte[] c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String arrays = Arrays.toString(this.c);
        return new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length() + String.valueOf(arrays).length()).append("ChimeTaskData{id=").append(valueOf).append(", jobType=").append(valueOf2).append(", payload=").append(arrays).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bus)) {
            return false;
        }
        bus bus = (bus) obj;
        if (this.a.equals(bus.a()) && this.b.equals(bus.b())) {
            if (Arrays.equals(this.c, bus instanceof buj ? ((buj) bus).c : bus.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Arrays.hashCode(this.c);
    }
}
