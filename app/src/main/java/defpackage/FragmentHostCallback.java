package defpackage;

/* renamed from: lm reason: default package */
/* compiled from: PG */
public class FragmentHostCallback extends FragmentContainer {
    public final android.app.Activity mActivity;
    public final android.content.Context mContext;
    public final android.os.Handler mHandler;
    public final FragmentManagerImpl mFragmentManager;

    FragmentHostCallback(FragmentActivity lgVar) {
        this(lgVar, lgVar, lgVar.b);
    }

    private FragmentHostCallback(android.app.Activity activity, android.content.Context context, android.os.Handler handler) {
        this.mFragmentManager = new FragmentManagerImpl();
        this.mActivity = activity;
        this.mContext = context;
        this.mHandler = handler;
    }

    public void a(java.lang.String str, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    public boolean b() {
        return true;
    }

    public android.view.LayoutInflater onGetLayoutInflater() {
        return android.view.LayoutInflater.from(this.mContext);
    }

    public void a(Fragment lcVar, android.content.Intent intent, int requestCode) {
        if (requestCode != -1) {
            throw new java.lang.IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.mContext.startActivity(intent);
    }

    public boolean d() {
        return true;
    }

    public int e() {
        return 0;
    }

    public android.view.View onFindViewById(int i) {
        return null;
    }

    public boolean onHasView() {
        return true;
    }
}
