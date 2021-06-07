package defpackage;

import android.os.ParcelFileDescriptor;

/* renamed from: bsv  reason: default package */
/* compiled from: PG */
final class bsv extends bro implements bsb {
    private final blu a;

    public bsv(blu blu) {
        super(blu);
        this.a = blu;
    }

    @Override // defpackage.bsb
    public final ParcelFileDescriptor b() {
        return this.a.c();
    }
}
