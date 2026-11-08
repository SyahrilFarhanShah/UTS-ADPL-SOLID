/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package policy;

import java.util.List;
import java.util.Set;
/**
 *
 * @author syahrilfarhan
 */
public final class RolePolicyRegistry {

    private static final List<RolePolicy> POLICIES =
            List.of(new StafPolicy(), new DokterPolicy(), new CustomerPolicy());

    private RolePolicyRegistry() {}

    public static RolePolicy forRole(String role) {
        if (role != null) {
            for (RolePolicy p : POLICIES) {
                if (p.role().equalsIgnoreCase(role)) return p;
            }
        }
        // perilaku lama dipertahankan: role tak dikenal -> tidak ada tab yang disembunyikan
        return new RolePolicy() {
            public String role() { return "unknown"; }
            public Set<DashboardTab> hiddenTabs() { return Set.of(); }
        };
    }
}
