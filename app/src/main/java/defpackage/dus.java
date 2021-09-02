package defpackage;

/* renamed from: dus reason: default package */
/* compiled from: PG */
final class dus {
    public final java.util.List a;
    public final java.util.List b;
    public final java.util.List c;

    dus(java.util.List list, java.util.List list2, java.util.List list3) {
        this.a = java.util.Collections.unmodifiableList((java.util.List) defpackage.cld.a((java.lang.Object) list, (java.lang.Object) "addresses"));
        this.b = java.util.Collections.unmodifiableList((java.util.List) defpackage.cld.a((java.lang.Object) list2, (java.lang.Object) "txtRecords"));
        this.c = java.util.Collections.unmodifiableList((java.util.List) defpackage.cld.a((java.lang.Object) list3, (java.lang.Object) "balancerAddresses"));
    }
}
