package haxe.format;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class JsonParser extends haxe.lang.HxObject
{
	public JsonParser(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public JsonParser(java.lang.String str)
	{
		//line 49 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		haxe.format.JsonParser.__hx_ctor_haxe_format_JsonParser(this, str);
	}
	
	
	public static void __hx_ctor_haxe_format_JsonParser(haxe.format.JsonParser __temp_me9, java.lang.String str)
	{
		//line 50 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		__temp_me9.str = str;
		//line 51 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		__temp_me9.pos = 0;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		return new haxe.format.JsonParser(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		return new haxe.format.JsonParser(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public java.lang.String str;
	
	public int pos;
	
	public java.lang.Object parseRec()
	{
		//line 55 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		while (true)
		{
			//line 56 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			int c = 0;
			//line 56 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			{
				//line 56 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				java.lang.String s = this.str;
				//line 56 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				int index = this.pos++;
				//line 56 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				if (( index < s.length() )) 
				{
					//line 56 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					c = ((int) (s.charAt(index)) );
				}
				else
				{
					//line 56 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					c = -1;
				}
				
			}
			
			//line 57 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			switch (c)
			{
				case 32:
				case 13:
				case 10:
				case 9:
				{
					//line 58 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
				case 123:
				{
					//line 61 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					java.lang.Object obj = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
					//line 61 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					java.lang.String field = null;
					//line 61 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					java.lang.Object comma = null;
					//line 62 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					while (true)
					{
						//line 63 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int c1 = 0;
						//line 63 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						{
							//line 63 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							java.lang.String s1 = this.str;
							//line 63 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							int index1 = this.pos++;
							//line 63 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							if (( index1 < s1.length() )) 
							{
								//line 63 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								c1 = ((int) (s1.charAt(index1)) );
							}
							else
							{
								//line 63 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								c1 = -1;
							}
							
						}
						
						//line 64 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						switch (c1)
						{
							case 32:
							case 13:
							case 10:
							case 9:
							{
								//line 65 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
							
							case 125:
							{
								//line 68 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (( ( field != null ) || haxe.lang.Runtime.eq(comma, false) )) 
								{
									//line 69 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidChar();
								}
								
								//line 70 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								return obj;
							}
							
							
							case 58:
							{
								//line 72 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (( field == null )) 
								{
									//line 73 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidChar();
								}
								
								//line 74 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								haxe.root.Reflect.setField(obj, field, this.parseRec());
								//line 75 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								field = null;
								//line 76 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								comma = true;
								//line 71 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
							
							case 44:
							{
								//line 78 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (haxe.lang.Runtime.toBool((comma))) 
								{
									//line 78 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									comma = false;
								}
								else
								{
									//line 78 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidChar();
								}
								
								//line 78 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
							
							case 34:
							{
								//line 80 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (haxe.lang.Runtime.toBool((comma))) 
								{
									//line 80 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidChar();
								}
								
								//line 81 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								field = this.parseString();
								//line 79 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
							
							default:
							{
								//line 83 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								this.invalidChar();
								//line 83 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
						}
						
					}
					
				}
				
				
				case 91:
				{
					//line 87 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					haxe.root.Array arr = new haxe.root.Array(new java.lang.Object[]{});
					//line 87 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					java.lang.Object comma1 = null;
					//line 88 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					while (true)
					{
						//line 89 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int c2 = 0;
						//line 89 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						{
							//line 89 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							java.lang.String s2 = this.str;
							//line 89 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							int index2 = this.pos++;
							//line 89 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							if (( index2 < s2.length() )) 
							{
								//line 89 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								c2 = ((int) (s2.charAt(index2)) );
							}
							else
							{
								//line 89 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								c2 = -1;
							}
							
						}
						
						//line 90 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						switch (c2)
						{
							case 32:
							case 13:
							case 10:
							case 9:
							{
								//line 91 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
							
							case 93:
							{
								//line 94 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (haxe.lang.Runtime.eq(comma1, false)) 
								{
									//line 94 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidChar();
								}
								
								//line 95 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								return arr;
							}
							
							
							case 44:
							{
								//line 97 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (haxe.lang.Runtime.toBool((comma1))) 
								{
									//line 97 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									comma1 = false;
								}
								else
								{
									//line 97 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidChar();
								}
								
								//line 97 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
							
							default:
							{
								//line 99 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (haxe.lang.Runtime.toBool((comma1))) 
								{
									//line 99 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidChar();
								}
								
								//line 100 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								this.pos--;
								//line 101 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								arr.push(this.parseRec());
								//line 102 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								comma1 = true;
								//line 98 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
						}
						
					}
					
				}
				
				
				case 116:
				{
					//line 106 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					int save = this.pos;
					//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					int __temp_stmt4 = 0;
					//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					{
						//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						java.lang.String s3 = this.str;
						//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int index3 = this.pos++;
						//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_stmt4 = ( (( index3 < s3.length() )) ? (((int) (s3.charAt(index3)) )) : (-1) );
					}
					
					//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_stmt3 = ( __temp_stmt4 != 114 );
					//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_boolv5 = false;
					//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if ( ! (__temp_stmt3) ) 
					{
						//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int __temp_stmt6 = 0;
						//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						{
							//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							java.lang.String s4 = this.str;
							//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							int index4 = this.pos++;
							//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							__temp_stmt6 = ( (( index4 < s4.length() )) ? (((int) (s4.charAt(index4)) )) : (-1) );
						}
						
						//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_boolv5 = ( __temp_stmt6 != 117 );
					}
					
					//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_stmt2 = ( __temp_stmt3 || __temp_boolv5 );
					//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_boolv7 = false;
					//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if ( ! (__temp_stmt2) ) 
					{
						//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int __temp_stmt8 = 0;
						//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						{
							//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							java.lang.String s5 = this.str;
							//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							int index5 = this.pos++;
							//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							__temp_stmt8 = ( (( index5 < s5.length() )) ? (((int) (s5.charAt(index5)) )) : (-1) );
						}
						
						//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_boolv7 = ( __temp_stmt8 != 101 );
					}
					
					//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_stmt1 = ( __temp_stmt2 || __temp_boolv7 );
					//line 107 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (__temp_stmt1) 
					{
						//line 108 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.pos = save;
						//line 109 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.invalidChar();
					}
					
					//line 111 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					return true;
				}
				
				
				case 102:
				{
					//line 113 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					int save1 = this.pos;
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					int __temp_stmt13 = 0;
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					{
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						java.lang.String s6 = this.str;
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int index6 = this.pos++;
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_stmt13 = ( (( index6 < s6.length() )) ? (((int) (s6.charAt(index6)) )) : (-1) );
					}
					
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_stmt12 = ( __temp_stmt13 != 97 );
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_boolv14 = false;
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if ( ! (__temp_stmt12) ) 
					{
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int __temp_stmt15 = 0;
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						{
							//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							java.lang.String s7 = this.str;
							//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							int index7 = this.pos++;
							//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							__temp_stmt15 = ( (( index7 < s7.length() )) ? (((int) (s7.charAt(index7)) )) : (-1) );
						}
						
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_boolv14 = ( __temp_stmt15 != 108 );
					}
					
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_stmt11 = ( __temp_stmt12 || __temp_boolv14 );
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_boolv16 = false;
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if ( ! (__temp_stmt11) ) 
					{
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int __temp_stmt17 = 0;
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						{
							//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							java.lang.String s8 = this.str;
							//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							int index8 = this.pos++;
							//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							__temp_stmt17 = ( (( index8 < s8.length() )) ? (((int) (s8.charAt(index8)) )) : (-1) );
						}
						
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_boolv16 = ( __temp_stmt17 != 115 );
					}
					
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_stmt10 = ( __temp_stmt11 || __temp_boolv16 );
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_boolv18 = false;
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if ( ! (__temp_stmt10) ) 
					{
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int __temp_stmt19 = 0;
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						{
							//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							java.lang.String s9 = this.str;
							//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							int index9 = this.pos++;
							//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							__temp_stmt19 = ( (( index9 < s9.length() )) ? (((int) (s9.charAt(index9)) )) : (-1) );
						}
						
						//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_boolv18 = ( __temp_stmt19 != 101 );
					}
					
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_stmt9 = ( __temp_stmt10 || __temp_boolv18 );
					//line 114 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (__temp_stmt9) 
					{
						//line 115 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.pos = save1;
						//line 116 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.invalidChar();
					}
					
					//line 118 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					return false;
				}
				
				
				case 110:
				{
					//line 120 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					int save2 = this.pos;
					//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					int __temp_stmt23 = 0;
					//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					{
						//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						java.lang.String s10 = this.str;
						//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int index10 = this.pos++;
						//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_stmt23 = ( (( index10 < s10.length() )) ? (((int) (s10.charAt(index10)) )) : (-1) );
					}
					
					//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_stmt22 = ( __temp_stmt23 != 117 );
					//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_boolv24 = false;
					//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if ( ! (__temp_stmt22) ) 
					{
						//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int __temp_stmt25 = 0;
						//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						{
							//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							java.lang.String s11 = this.str;
							//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							int index11 = this.pos++;
							//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							__temp_stmt25 = ( (( index11 < s11.length() )) ? (((int) (s11.charAt(index11)) )) : (-1) );
						}
						
						//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_boolv24 = ( __temp_stmt25 != 108 );
					}
					
					//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_stmt21 = ( __temp_stmt22 || __temp_boolv24 );
					//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_boolv26 = false;
					//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if ( ! (__temp_stmt21) ) 
					{
						//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						int __temp_stmt27 = 0;
						//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						{
							//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							java.lang.String s12 = this.str;
							//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							int index12 = this.pos++;
							//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							__temp_stmt27 = ( (( index12 < s12.length() )) ? (((int) (s12.charAt(index12)) )) : (-1) );
						}
						
						//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_boolv26 = ( __temp_stmt27 != 108 );
					}
					
					//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean __temp_stmt20 = ( __temp_stmt21 || __temp_boolv26 );
					//line 121 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (__temp_stmt20) 
					{
						//line 122 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.pos = save2;
						//line 123 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.invalidChar();
					}
					
					//line 125 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					return null;
				}
				
				
				case 34:
				{
					//line 127 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					return this.parseString();
				}
				
				
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 45:
				{
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					int c3 = c;
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					int start = ( this.pos - 1 );
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean minus = ( c3 == 45 );
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean digit =  ! (minus) ;
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean zero = ( c3 == 48 );
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean point = false;
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean e = false;
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean pm = false;
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					boolean end = false;
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					while (true)
					{
						//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						{
							//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							java.lang.String s13 = this.str;
							//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							int index13 = this.pos++;
							//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							if (( index13 < s13.length() )) 
							{
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								c3 = ((int) (s13.charAt(index13)) );
							}
							else
							{
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								c3 = -1;
							}
							
						}
						
						//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						switch (c3)
						{
							case 48:
							{
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (( zero &&  ! (point)  )) 
								{
									//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (minus) 
								{
									//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									minus = false;
									//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									zero = true;
								}
								
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								digit = true;
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
							
							case 49:
							case 50:
							case 51:
							case 52:
							case 53:
							case 54:
							case 55:
							case 56:
							case 57:
							{
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (( zero &&  ! (point)  )) 
								{
									//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (minus) 
								{
									//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									minus = false;
								}
								
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								digit = true;
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								zero = false;
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
							
							case 46:
							{
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (( minus || point )) 
								{
									//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								digit = false;
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								point = true;
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
							
							case 101:
							case 69:
							{
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if (( ( minus || zero ) || e )) 
								{
									//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								digit = false;
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								e = true;
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
							
							case 43:
							case 45:
							{
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if ((  ! (e)  || pm )) 
								{
									//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								digit = false;
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								pm = true;
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
							
							default:
							{
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								if ( ! (digit) ) 
								{
									//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
									this.invalidNumber(start);
								}
								
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								this.pos--;
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								end = true;
								//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
								break;
							}
							
						}
						
						//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						if (end) 
						{
							//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
							break;
						}
						
					}
					
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					double f = haxe.root.Std.parseFloat(haxe.lang.StringExt.substr(this.str, start, ( this.pos - start )));
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					int i = ((int) (f) );
					//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (( i == f )) 
					{
						//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return i;
					}
					else
					{
						//line 129 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return f;
					}
					
				}
				
				
				default:
				{
					//line 131 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					this.invalidChar();
					//line 131 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
			}
			
		}
		
	}
	
	
	public java.lang.String parseString()
	{
		//line 137 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		int start = this.pos;
		//line 138 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		haxe.root.StringBuf buf = null;
		//line 139 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		while (true)
		{
			//line 140 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			int c = 0;
			//line 140 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			{
				//line 140 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				java.lang.String s = this.str;
				//line 140 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				int index = this.pos++;
				//line 140 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				if (( index < s.length() )) 
				{
					//line 140 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					c = ((int) (s.charAt(index)) );
				}
				else
				{
					//line 140 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					c = -1;
				}
				
			}
			
			//line 141 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			if (( c == 34 )) 
			{
				//line 142 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				break;
			}
			
			//line 143 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			if (( c == 92 )) 
			{
				//line 144 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				if (( buf == null )) 
				{
					//line 145 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					buf = new haxe.root.StringBuf();
				}
				
				//line 147 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				buf.addSub(this.str, start, ( ( this.pos - start ) - 1 ));
				//line 148 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				{
					//line 148 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					java.lang.String s1 = this.str;
					//line 148 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					int index1 = this.pos++;
					//line 148 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (( index1 < s1.length() )) 
					{
						//line 148 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						c = ((int) (s1.charAt(index1)) );
					}
					else
					{
						//line 148 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						c = -1;
					}
					
				}
				
				//line 149 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				switch (c)
				{
					case 114:
					{
						//line 150 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						buf.addChar(13);
						//line 150 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						break;
					}
					
					
					case 110:
					{
						//line 151 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						buf.addChar(10);
						//line 151 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						break;
					}
					
					
					case 116:
					{
						//line 152 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						buf.addChar(9);
						//line 152 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						break;
					}
					
					
					case 98:
					{
						//line 153 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						buf.addChar(8);
						//line 153 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						break;
					}
					
					
					case 102:
					{
						//line 154 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						buf.addChar(12);
						//line 154 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						break;
					}
					
					
					case 47:
					case 92:
					case 34:
					{
						//line 155 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						buf.addChar(c);
						//line 155 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						break;
					}
					
					
					case 117:
					{
						//line 157 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						java.lang.Object uc = haxe.root.Std.parseInt(( "0x" + haxe.lang.StringExt.substr(this.str, this.pos, 4) ));
						//line 158 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.pos += 4;
						//line 176 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						buf.addChar(((int) (haxe.lang.Runtime.toInt(uc)) ));
						//line 156 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						break;
					}
					
					
					default:
					{
						//line 179 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						throw haxe.lang.HaxeException.wrap(( ( ( "Invalid escape sequence \\" + Character.toString((char) c) ) + " at position " ) + (( this.pos - 1 )) ));
					}
					
				}
				
				//line 181 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				start = this.pos;
			}
			else
			{
				//line 193 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				if (( c == -1 )) 
				{
					//line 194 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					throw haxe.lang.HaxeException.wrap("Unclosed string");
				}
				
			}
			
		}
		
		//line 196 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		if (( buf == null )) 
		{
			//line 197 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			return haxe.lang.StringExt.substr(this.str, start, ( ( this.pos - start ) - 1 ));
		}
		else
		{
			//line 200 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			buf.addSub(this.str, start, ( ( this.pos - start ) - 1 ));
			//line 201 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			return buf.toString();
		}
		
	}
	
	
	public void invalidChar()
	{
		//line 248 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		this.pos--;
		//line 249 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		int __temp_stmt1 = 0;
		//line 249 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		{
			//line 249 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			java.lang.String s = this.str;
			//line 249 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			int index = this.pos;
			//line 249 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			__temp_stmt1 = ( (( index < s.length() )) ? (((int) (s.charAt(index)) )) : (-1) );
		}
		
		//line 249 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		throw haxe.lang.HaxeException.wrap(( ( ( "Invalid char " + __temp_stmt1 ) + " at position " ) + this.pos ));
	}
	
	
	public void invalidNumber(int start)
	{
		//line 253 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		throw haxe.lang.HaxeException.wrap(( ( ( "Invalid number at position " + start ) + ": " ) + haxe.lang.StringExt.substr(this.str, start, ( this.pos - start )) ));
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		{
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			switch (field.hashCode())
			{
				case 111188:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("pos")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.pos = ((int) (value) );
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return value;
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		{
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			switch (field.hashCode())
			{
				case 111188:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("pos")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.pos = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return value;
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
				case 114225:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("str")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.str = haxe.lang.Runtime.toString(value);
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return value;
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		{
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			switch (field.hashCode())
			{
				case -1321720800:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("invalidNumber")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidNumber")) );
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
				case 114225:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("str")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return this.str;
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
				case -953670163:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("invalidChar")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidChar")) );
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
				case 111188:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("pos")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return this.pos;
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
				case -678275932:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("parseString")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "parseString")) );
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
				case 1187792093:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("parseRec")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "parseRec")) );
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		{
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			switch (field.hashCode())
			{
				case 111188:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("pos")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return ((double) (this.pos) );
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		{
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			switch (field.hashCode())
			{
				case -1321720800:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("invalidNumber")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.invalidNumber(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
				case 1187792093:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("parseRec")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return this.parseRec();
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
				case -953670163:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("invalidChar")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						this.invalidChar();
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
				case -678275932:
				{
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					if (field.equals("parseString")) 
					{
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
						return this.parseString();
					}
					
					//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		baseArr.push("pos");
		//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		baseArr.push("str");
		//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
		{
			//line 30 "/usr/lib/haxe/std/haxe/format/JsonParser.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


