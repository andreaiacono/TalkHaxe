package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Test extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		main();
	}
	
	public Test(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Test(java.lang.String jsonData)
	{
		//line 11 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		haxe.Test.__hx_ctor_haxe_Test(this, jsonData);
	}
	
	
	public static void __hx_ctor_haxe_Test(haxe.Test __temp_me8, java.lang.String jsonData)
	{
		//line 12 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		__temp_me8.root = new haxe.format.JsonParser(haxe.lang.Runtime.toString(jsonData)).parseRec();
		//line 13 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, ( "name=" + haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(__temp_me8.root, "name", true)) ), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.Test", "Test.hx", "new"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (13) )) )}));
		//line 14 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, ( "children=" + haxe.root.Std.string(((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(__temp_me8.root, "children", true)) ).__get(0)) ), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.Test", "Test.hx", "new"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (14) )) )}));
	}
	
	
	public static void main()
	{
		//line 6 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		haxe.Test test = new haxe.Test(haxe.lang.Runtime.toString("{ \"name\" : \"test\", [ {\"name\": \"child1\"}, { \"name\":\"child2\"}]};"));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		return new haxe.Test(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		return new haxe.Test(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public java.lang.Object root;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		{
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			switch (field.hashCode())
			{
				case 3506402:
				{
					//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
					if (field.equals("root")) 
					{
						//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
						this.root = ((java.lang.Object) (value) );
						//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
						return value;
					}
					
					//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
					break;
				}
				
				
			}
			
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		{
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			switch (field.hashCode())
			{
				case 3506402:
				{
					//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
					if (field.equals("root")) 
					{
						//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
						this.root = ((java.lang.Object) (value) );
						//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
						return value;
					}
					
					//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
					break;
				}
				
				
			}
			
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		{
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			switch (field.hashCode())
			{
				case 3506402:
				{
					//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
					if (field.equals("root")) 
					{
						//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
						return this.root;
					}
					
					//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
					break;
				}
				
				
			}
			
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		{
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			switch (field.hashCode())
			{
				case 3506402:
				{
					//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
					if (field.equals("root")) 
					{
						//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.root)) );
					}
					
					//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
					break;
				}
				
				
			}
			
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		baseArr.push("root");
		//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
		{
			//line 3 "/home/francesco/projects/haxe-talk/src/haxe/Test.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


