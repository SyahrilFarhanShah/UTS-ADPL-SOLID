/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package policy;

import java.util.Set;

/**
 *
 * @author syahrilfarhan
 */
public class DokterPolicy implements RolePolicy {

    @Override
    public String role() {
        return "dokter";
    }

    @Override
    public Set<DashboardTab> hiddenTabs() {
        return Set.of(DashboardTab.USER, DashboardTab.HEWAN,
                DashboardTab.LAYANAN, DashboardTab.RIWAYAT);
    }

    @Override
    public boolean canManageReservasi() {
        return false;
    }
}
