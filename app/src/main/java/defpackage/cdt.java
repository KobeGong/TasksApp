package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: cdt  reason: default package */
/* compiled from: PG */
public final class cdt extends AsyncTask {
    private final bsb a;
    private final cdq b;

    public cdt(bsb bsb, cdq cdq) {
        this.a = bsb;
        this.b = cdq;
    }

    private final Bitmap a() {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.a.b());
        try {
            return BitmapFactory.decodeStream(autoCloseInputStream);
        } finally {
            try {
                autoCloseInputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.b.a((Bitmap) obj);
    }

    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }
}
