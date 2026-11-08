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
public class StafPolicy implements RolePolicy {
    public String role() { return "staf"; }
    public Set<DashboardTab> hiddenTabs() { return Set.of(); }
}
