package defpackage;

/* renamed from: cbh  reason: default package */
/* compiled from: PG */
public final class cbh implements caf {
    cbh() {
    }

    @Override // defpackage.caf
    public final void a(String str, djo djo) {
        bty.a("UpdateThreadStateCallback", "Successfully updated thread state for account: %s.", str);
    }

    @Override // defpackage.caf
    public final void a(String str) {
        bty.b("UpdateThreadStateCallback", "Failed to updated thread state for account: %s.", str);
    }
}
