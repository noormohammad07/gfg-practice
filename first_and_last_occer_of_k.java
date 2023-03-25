
    ArrayList<Long> occ = new ArrayList<Long>();
    int first=-1,last=-1;
    for(int i=0;i<n;i++)
    {
        if(a[i]==x)
        {
            first=i;
            break;
        }
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]==x)
        {
            last=i;
        }
    }
    occ.add((long)first);
    occ.add((long)last);
    return occ;
}
}
    
}
