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


public class CustomerPolicy implements RolePolicy {

    @Override
    public String role() {
        return "customer";
    }

    @Override
    public Set<DashboardTab> hiddenTabs() {
        return Set.of(DashboardTab.USER, DashboardTab.HEWAN,
                DashboardTab.RESERVASI, DashboardTab.LAYANAN);
    }
}
