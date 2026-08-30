package fundamentals.assigment_problems;

// Runs the inventory balance check on sample sections.
public class A4_WarehouseInventoryDemo {

    public static void main(String[] args) {
        WarehouseInventoryBalancer balancer = new WarehouseInventoryBalancer();
        balancer.analyzeInventory(new int[]{20, 15, 30}, new int[]{25, 10, 30});
        balancer.analyzeInventory(new int[]{12, 40, 8}, new int[]{12, 35, 50});
    }
}
