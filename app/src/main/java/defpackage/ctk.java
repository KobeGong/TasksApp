package defpackage;

import java.util.logging.Level;

/* renamed from: ctk  reason: default package */
/* compiled from: PG */
public final class ctk extends ctn implements cua {
    private final /* synthetic */ ctl a;

    private ctk(Level level, boolean z) {
        super(level, z);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ctn
    public final cvz a() {
        return cvw.a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    ctk(ctl ctl, Level level, boolean z) {
        this(level, z);
        this.a = ctl;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ctn
    public final /* synthetic */ ctj b() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ctn
    public final /* bridge */ /* synthetic */ cua c() {
        if (this != null) {
            return this;
        }
        throw null;
    }
}
