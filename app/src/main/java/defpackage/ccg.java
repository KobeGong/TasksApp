package defpackage;

/* renamed from: ccg reason: default package */
/* compiled from: PG */
final class ccg implements defpackage.caf {
    public defpackage.cbx a;

    ccg() {
    }

    public final void a(java.lang.String str) {
        defpackage.bty.b("RemoveTargetCallback", "Unregistration finished for account: %s (FAILURE).", str);
        this.a.a(str, defpackage.btk.FAILED_UNREGISTRATION);
    }

    public final void a(java.lang.String str, defpackage.djo djo) {
        defpackage.bty.a("RemoveTargetCallback", "Unregistration finished for account: %s (SUCCESS).", str);
        this.a.a(str, defpackage.btk.UNREGISTERED);
    }
}
