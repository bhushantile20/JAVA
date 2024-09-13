import java.util.*;
class SubjectList{

       public static void main(String args[])
{
      List<String> subjects=new LinkedList<>();
         Scanner sc=new Scanner(System.in);

			                 int n;

			System.out.print("Enter how many subjects:");
			n=sc.nextInt();

			System.out.println("Enter "+n+"subject names:");
			for(int i=0;i<n;i++)
					{
			 subjects.add(sc.next());
					}
			System.out.println("All subjects are as follows");
				Iterator<String> itr=subjects.iterator();
					 while(itr.hasNext())
						{
							   System.out.println(itr.next());
						}

					System.out.print("[");
							while(true)
									{
												System.out.println(itr.next());
												if(!itr.hasNext())
												break;
													System.out.print(",");
			}
			System.out.println("]");
			}
			}