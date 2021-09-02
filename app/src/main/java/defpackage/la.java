package defpackage;

/* renamed from: la reason: default package */
/* compiled from: PG */
abstract class la extends defpackage.kz {
    public boolean a;

    la() {
    }

    public void startActivityForResult(android.content.Intent intent, int i, android.os.Bundle bundle) {
        if (!this.a && i != -1) {
            a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) {
        if (i != -1) {
            a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
