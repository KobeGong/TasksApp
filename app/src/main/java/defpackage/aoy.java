package defpackage;

import android.transition.Fade;

import com.google.android.apps.tasks.R;

/* renamed from: aoy reason: default package */
public final /* synthetic */ class aoy implements java.lang.Runnable {
    private final com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity;
    private final defpackage.aoe b;
    private final AbsDeviceOwner deviceOwner;
    private final defpackage.cyi d;

    public aoy(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity, defpackage.aoe aoe, AbsDeviceOwner cdu, defpackage.cyi cyi) {
        this.taskListsActivity = taskListsActivity;
        this.b = aoe;
        this.deviceOwner = cdu;
        this.d = cyi;
    }

    public final void run() {
        this.taskListsActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (taskListsActivity.r()) {
                    b.a(deviceOwner.accountName());
                    return;
                }
                taskListsActivity.getWindow().clearFlags(16);
                try {
                    if (((AbsAccountSetupResult) d.get()).isSuccess()) {
                        boolean onboardingDismiss = !defpackage.aiw.getInstance(taskListsActivity.getBaseContext()).isOnboardingDismiss();
                        taskListsActivity.hideSplashView();
                        if (!defpackage.any.get().c().a()) {
                            taskListsActivity.a((String) null);
                        }
                        defpackage.any.get().c().c();
                        Fragment selectedFragment = taskListsActivity.selectedFragment;
                        java.lang.Object transition = null;
                        if ((!(selectedFragment instanceof WelcomeFragment) || !onboardingDismiss) && android.os.Build.VERSION.SDK_INT >= 21) {
                            transition = new Fade();
                        }
                        if (!taskListsActivity.l && (selectedFragment instanceof defpackage.arb)) {
                            ((defpackage.arb) selectedFragment).O();
                        }
                        if (selectedFragment == null || (selectedFragment instanceof WelcomeFragment)) {
                            taskListsActivity.getSupportFragmentManager().popBackStack();
                            if (selectedFragment != null) {
                                selectedFragment.setExitTransition(transition);
                                taskListsActivity.tasksFragment.setEnterTranstion(transition);
                            }
                            taskListsActivity.getSupportFragmentManager()
                                    .beginTransaction().replace(R.id.fragment_container, taskListsActivity.tasksFragment, "tasksfragment").commitAllowingStateLoss();
                            taskListsActivity.setFragmentSelected(taskListsActivity.tasksFragment);
                        }
                        java.util.List<defpackage.dcb> d3 = defpackage.any.get().c().d();
                        java.util.HashSet<String> hashSet = new java.util.HashSet<>();
                        for (defpackage.dcb dcb : d3) {
                            hashSet.add(dcb.b);
                        }
                        defpackage.ain b3 = defpackage.ain.b(taskListsActivity, deviceOwner.accountName());
                        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();
                        for (String key : b3.preferences.getAll().keySet()) {
                            if (key.startsWith("task-list-order:") && !hashSet.contains(key.substring(16))) {
                                arrayList.add(key);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            android.content.SharedPreferences.Editor edit = b3.preferences.edit();
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                String obj2 = arrayList.get(i);
                                i++;
                                edit.remove(obj2);
                            }
                            edit.apply();
                        }
                        taskListsActivity.l = true;
                        AbsActivityConfig activityConfig = b.a(taskListsActivity, deviceOwner.accountName());
                        String selectedListId = activityConfig.getSelectedListId();
                        if (selectedListId != null && !selectedListId.equals(taskListsActivity.h.b)) {
                            for (defpackage.dcb dcb2 : d3) {
                                if (selectedListId.equals(dcb2.b)) {
                                    taskListsActivity.b(dcb2);
                                }
                            }
                        }
                        Fragment activityConfigFragment = activityConfig.getFragment();
                        if (activityConfigFragment != null) {
                            taskListsActivity.getSupportFragmentManager().popBackStack();
                            taskListsActivity.showFragment(activityConfigFragment);
                        } else if (onboardingDismiss) {
                            taskListsActivity.getSupportFragmentManager().popBackStack();
                            WelcomeFragment welcomeFragment;
                            boolean z;
                            if (selectedFragment instanceof WelcomeFragment) {
                                taskListsActivity.getSupportFragmentManager().b();
                                welcomeFragment = (WelcomeFragment) selectedFragment;
                                welcomeFragment.setState(defpackage.bg.Q);
                                welcomeFragment.setEnterTranstion(null);
                                welcomeFragment.setExitTransition((java.lang.Object) null);
                                z = true;
                            } else {
                                welcomeFragment = WelcomeFragment.newInstance(defpackage.bg.Q);
                                z = false;
                            }
                            taskListsActivity.setFragmentSelected((Fragment) welcomeFragment);
                            FragmentTransaction a4 = taskListsActivity.getSupportFragmentManager().beginTransaction();
                            a4.replace(R.id.fragment_container, welcomeFragment, "cannotInitializeAccount");
                            a4.addToBackStack();
                            a4.commitAllowingStateLoss();
                            if (z) {
                                taskListsActivity.getSupportFragmentManager().b();
                            }
                        } else if (selectedFragment instanceof TasksFragment) {
                            taskListsActivity.setFragmentSelected((Fragment) taskListsActivity.tasksFragment);
                        }
                    } else {
                        taskListsActivity.showWelcomeFragment(defpackage.bg.P);
                        b.a(deviceOwner.accountName());
                    }
                } catch (java.lang.Exception e) {
                    taskListsActivity.showWelcomeFragment(defpackage.bg.P);
                    b.a(deviceOwner.accountName());
                }
            }
        });
    }
}
