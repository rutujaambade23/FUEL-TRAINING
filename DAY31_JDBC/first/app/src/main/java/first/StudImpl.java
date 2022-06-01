package first;



public class StudImpl implements StudInterface {

    @Override
    public void save(Student st) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Student st) {
        // TODO Auto-generated method stub
        String sql = "";
        String name = st.getName();
        int id = st.getId();
        sql = "update student set name='" + name + "' where id=" + id;
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Updated");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void delete(Student st) {
        // TODO Auto-generated method stub

    }

    @Override
    public Student getStud(int id) {
        // TODO Auto-generated method stub
        return null;
    }

}




  
    

