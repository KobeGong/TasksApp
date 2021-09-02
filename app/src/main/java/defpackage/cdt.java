package defpackage;

/* renamed from: cdt reason: default package */
/* compiled from: PG */
public final class cdt extends android.os.AsyncTask {
    private final defpackage.bsb a;
    private final defpackage.cdq b;

    public cdt(defpackage.bsb bsb, defpackage.cdq cdq) {
        this.a = bsb;
        this.b = cdq;
    }

    private final android.graphics.Bitmap a() {
        android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(this.a.b());
        try {
            return android.graphics.BitmapFactory.decodeStream(autoCloseInputStream);
        } finally {
            try {
                autoCloseInputStream.close();
            } catch (java.io.IOException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(java.lang.Object obj) {
        this.b.a((android.graphics.Bitmap) obj);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        return a();
    }
}
