package defpackage;

/* renamed from: ccg  reason: default package */
/* compiled from: PG */
final class ccg implements caf {
    public cbx a;

    ccg() {
    }

    @Override // defpackage.caf
    public final void a(String str) {
        bty.b("RemoveTargetCallback", "Unregistration finished for account: %s (FAILURE).", str);
        this.a.a(str, btk.FAILED_UNREGISTRATION);
    }

    @Override // defpackage.caf
    public final void a(String str, djo djo) {
        bty.a("RemoveTargetCallback", "Unregistration finished for account: %s (SUCCESS).", str);
        this.a.a(str, btk.UNREGISTERED);
    }
}
