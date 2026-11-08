/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package policy;
import java.util.Set;

/**
 *
 * @author syahrilfarhan
 */
public interface RolePolicy {
    String role();
    Set<DashboardTab> hiddenTabs();
    default boolean canManageReservasi() { return true; }
}
