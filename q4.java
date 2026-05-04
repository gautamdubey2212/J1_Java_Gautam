package Test;


interface Operation {
    void insertData(String data);
    void updateData(String oldData, String newData);
    void deleteData(String data);
    void showData();
}

class Implementor implements Operation {

    protected String storage = "";

    @Override
    public void insertData(String data) {
        // Precondition
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Data cannot be empty");
        }

        storage = data;

        // Postcondition
        if (!storage.equals(data)) {
            throw new AssertionError("Insert failed");
        }
    }

    @Override
    public void updateData(String oldData, String newData) {
        // Precondition
        if (!storage.equals(oldData)) {
            throw new IllegalStateException("Old data mismatch");
        }

        storage = newData;

        // Postcondition
        if (!storage.equals(newData)) {
            throw new AssertionError("Update failed");
        }
    }

    @Override
    public void deleteData(String data) {
        // Precondition
        if (!storage.equals(data)) {
            throw new IllegalStateException("Data not found");
        }

        storage = "";

        // Postcondition
        if (!storage.equals("")) {
            throw new AssertionError("Delete failed");
        }
    }

    @Override
    public void showData() {
        System.out.println("Data: " + storage);
    }
}

class Dev1 extends Implementor {
    @Override
    public void insertData(String data) {
        System.out.println("Dev1 inserting...");
        super.insertData(data);
    }

    @Override
    public void deleteData(String data) {
        System.out.println("Dev1 deleting...");
        super.deleteData(data);
    }
}

class Dev2 extends Implementor {
    @Override
    public void updateData(String oldData, String newData) {
        System.out.println("Dev2 updating...");
        super.updateData(oldData, newData);
    }

    @Override
    public void showData() {
        System.out.println("Dev2 view:");
        super.showData();
    }
}


public class q4 {

	public static void main(String[] args) {
		 Dev1 d1 = new Dev1();
	        d1.insertData("Hello");
	        d1.showData();
	        d1.deleteData("Hello");

	        Dev2 d2 = new Dev2();
	        d2.insertData("Java");
	        d2.updateData("Java", "Advanced Java");
	        d2.showData();
	    }
	


	}

}
