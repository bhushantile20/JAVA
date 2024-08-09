// methods of ResultSet
// next()  : no need to have scrollable resultset
// previous()
// first()
// last()
// absolute()
// relative()
// getRow()
// beforeFirst()
// afterLast()
// isFirst()
// isLast()
// isBeforeFirst()
// isAfterLast()

// deleteRow()
// updateRow()
    // updateInt()
    // updateString()
    // updateFloat()
// moveToInsertRow()
// insertRow()



import java.sql.*;
class ScrollableStudent{
    public static void main(String args[]){
        Connection con;
        Statement stmt;
        ResultSet rs;        
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost/tyjdbc1","postgres","password");
            // stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("select * from student");

            // if(rs.isBeforeFirst())
            //     System.out.println("cursor is at before first");

            // rs.next();
            // System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));

            // rs.next();
            // System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));

            // rs.last();
            // System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
      
            // rs.first();
            // System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
      
            // rs.absolute(4);
            // System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
      
            // rs.relative(-1);
            // System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
      
            // rs.relative(2);
            // System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
      

            // rs.beforeFirst();
            // while(rs.next()){
            //     System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));      
            // }

            // if(rs.isAfterLast())
            //     System.out.println("cursor is at after last");

            // rs.first();
            // System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
      
            // rs.afterLast();
            // while(rs.previous()){
            //     System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));      
            // }

            // if(rs.isBeforeFirst())
            //     System.out.println("cursor is at befoer first");

            // rs.last();
            // if(rs.isLast())
            //     System.out.println("cursor is at last");

            // rs.first();
            // if(rs.isFirst())
            //     System.out.println("cursor is at first");





            // System.out.println("Before deletion");
            // while(rs.next()){
            //     System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));      
            // }

            // rs.absolute(3);
            // rs.deleteRow();

            // System.out.println("After deletion");
            // rs.beforeFirst();
            // while(rs.next()){
            //     System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));      
            // }






            // System.out.println("Before updation");
            // while(rs.next()){
            //     System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));      
            // }

            // rs.absolute(3);
            // rs.updateInt(1,300);
            // rs.updateString(2,"qqqqq");
            // rs.updateFloat(3,99);
            // rs.updateRow();


            // System.out.println("After updation");
            // rs.beforeFirst();
            // while(rs.next()){
            //     System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));      
            // }



            System.out.println("Before insertion");
            while(rs.next()){
                System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));      
            }

            rs.moveToInsertRow();  //go to blank area and create a blank row
            rs.updateInt(1,1000);
            rs.updateString(2,"ooooo");
            rs.updateFloat(3,100);
            rs.insertRow();

            System.out.println("After insertion");
            rs.beforeFirst();
            while(rs.next()){
                System.out.println("Record "+rs.getRow()+" : "+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));      
            }



        }catch(Exception e){
            System.out.println(e);
        }
    }
}