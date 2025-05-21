public class VehicleStorageAdapter implements IVehicleStorage{
    private OldVehicleStorage oldStorage;

    public VehicleStorageAdapter(OldVehicleStorage oldStorage) {
        this.oldStorage = oldStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        String legacyData = "ID: " + vehicle.getId() +
                            ", Modelo: " + vehicle.getModel() +
                            ", Ano: " + vehicle.getYear();

        oldStorage.storeVehicleData(legacyData);
    }
}
