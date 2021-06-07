package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* renamed from: bcr  reason: default package */
/* compiled from: PG */
public final class bcr implements ayv, Iterable {
    private final DataHolder a;

    public final int b() {
        if (this.a == null) {
            return 0;
        }
        return this.a.e;
    }

    public final /* synthetic */ Object a(int i) {
        return new bnp(this.a, i);
    }

    private bcr(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bcu(this);
    }

    @Override // defpackage.ayv
    public final void a() {
        if (this.a != null) {
            this.a.close();
        }
    }

    public bcr(DataHolder dataHolder, byte b) {
        this(dataHolder);
    }
}
