package com.company;

import java.util.ArrayList;
import java.util.List;

public class SparseArray
{
    /** The number of rows and columns in the sparse array */
    private int numRows;
    private int numCols;

    /** The list of entries representing the non-zero elements of the sparse array.
     *  Entries are stored in the list in no particular order.
     *  Each non-zero element is represented by exactly one entry in the list.
     */
    private List<SparseArrayEntry> entries;

    /** Constructs an empty SparseArray */
    public SparseArray()
    {  entries = new ArrayList<SparseArrayEntry>(); }

    /** Mrs. Q created this method to add entries */
    public void addEntry( SparseArrayEntry num )
    {
        entries.add( num );
        if ( num.getRow() > numRows )
        {
            numRows = num.getRow()+1;
        }
        if ( num.getCol() > numCols )
        {
            numCols = num.getCol()+1;
        }
    }

    /** Returns the number of rows in the sparse array. */
    public int getNumRows()
    {   return numRows;   }

    /** Returns the number of rows in the sparse array. */
    public int getNumCols()
    {   return numCols;   }

    /** Returns the value of the element at row index row and column index col in the sparse array
     *  Precondition: 0 <= row < getNumRows()
     *                0 <= col < getNumCols()
     */
    public int getValueAt( int row, int col )
    {
        for (SparseArrayEntry obj: entries) {
            if(obj.getRow() == row && obj.getCol() == col){
                return  obj.getValue();
            }
        }
        return 0;
    }

    /** Removes the column col from the sparse array
     *  Precondition: 0 <= col < getNumCols()
     */
    public void removeColumn( int col )
    {
        for (int i = 0; i < entries.size(); i++){
            if (col == entries.get(i).getCol()) {
                entries.remove(i);
                i--;
                }
            }
        for (int i = 0; i < entries.size(); i++){
            if (entries.get(i).getCol() > col){
                entries.set(i, new SparseArrayEntry(entries.get(i).getRow(), entries.get(i).getCol()-1, entries.get(i).getValue()));
            }
        }
        numCols--;
    }


    /** Mrs. Q created this toString method */
    public String toString()
    {
        String output = new String();
        for ( SparseArrayEntry entry : entries )
        {
            output += entry;
        }
        return output;
    }
    // There may be instance variables, constructors, and methods that are not shown.
}

